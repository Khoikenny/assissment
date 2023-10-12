package questionaboutwhile;

import java.util.Scanner;
import java.util.SortedMap;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        int NUMBER_OF_QUESTION = 5; //so cau hoi
        int correctNumber = 0;
        //so cau dung
        int count = 0;
        //count the number of question
        long starttime = System.currentTimeMillis();
        String output = "";
        Scanner sc = new Scanner(System.in);
        while(count < NUMBER_OF_QUESTION ){
        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);
            System.out.println("what is "+ number1 + " -" + number2 +"=");
            int answer = sc.nextInt();
            if (number1 - number2 == answer){
                System.out.println("you are correct");
                correctNumber++;
            }else{
                System.out.println("you have the wrong answer.\n"+ number1 + " - " + number2+
                        " should be " + (number1-number2));
                count++;
                // ta "?" sau nso phai la dieu kien ma ta muon no tinh day la while o dau cau
                //nen no se xem xet tung tung vong mot cho den khi du o day la 5 cau cho nee
                //quét từng vòng vì ta sử dụng ưhile tới cuối là nó tính một vì ta không sử dụng
                // sout nên nó sẽ ko hiện giống như count++ và correctNumber++ nó chỉ gọp lạ và tính
                //ở ngoài vòng của nó là sau while.
                output +="\n"+ number1 + "-" + number2 + "=" + answer  +
                        ((number1 - number2 == answer) ? "correct" : "wrong");
                //phan nay co nghia la sau khi no tinh xong thi no
                //se dem so luong cau minh dung o cuooi dong
            }

        }
        long end_time =System.currentTimeMillis();
        long time = end_time-starttime;
        System.out.println("so there are "+ correctNumber + "you have\n"
                + "the test time is"+time + " second\n" + output);
        //output o dau chinh laf phan ma no tong ket duoc tu dau cho den cuoi
        //va xem no dung hay sai khi am ta dung ? va sau no


    }
}
