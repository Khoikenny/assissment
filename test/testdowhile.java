package test;

import java.util.Scanner;

public class testdowhile {
    public static void main(String[] args) {
        int correct =0;
        int negative = 0;
        int total = 0;
        int integer;
        //nếu được nên nêu ra hết tất cả sẽ xuất hiện hết tất cả biến sẽ xuất hiện
       Scanner sc = new Scanner(System.in);
        System.out.println(" enter the integer, the input ends if it is 0");
        // khi mà sử dụng do while thì nên cho cái mình muốn nó làm cho vào trong
        // nếu không thì nó sẽ không xuất hiện

        do{
             integer = sc.nextInt();
            if (integer >0)
            {
                total += integer;
                correct++;
            }else if(integer<0){
                total += integer;
                negative++;
            }
            // do là tìm trước rồi mới tới điều kiện
        }while(integer !=0);
        if(negative + correct == 0){
            // có nghhĩa là nếu khi mà nó bằng 0 có nghĩa là không có số nào thích hợp
            // với nó cho nên là mới đi xuống cái này là số nó bằng ko
            // đây là cách đi đường vòng chứ ko đi chức tiếp vào vấn đề là 0 là sai
            System.out.println(" enter the wrong one");
        }else{// là để là khi nó đã có số rồi thì nó sẽ đi xuống dưới này chứ không ở trên đó
            // nữa
            double average =( double) total /(correct+negative);
            System.out.println("the correct is" + correct);
            System.out.println(" the negative is " + negative);
            System.out.println("the total is " + total);
            System.out.println("the avarage is" + average);

        }



    }
}