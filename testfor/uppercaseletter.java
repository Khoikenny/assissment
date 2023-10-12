package testfor;

import java.util.Scanner;


public class uppercaseletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String uppercase_letter = sc.nextLine();
        //nếu mình bỏ từ UpperCase sau nextLine() thì nó sẽ biến đổi các từ sau nó thành chữ viết hoa
        int number_uppercase=0;
        for(int i =0; i < uppercase_letter.length();i++){
            char ch = uppercase_letter.charAt(i);
            // hai dòng ở trên chỉ là i=0 là nó biến dòng chữ của ta thành từng phần
            //một để quét từng cái lenth ở đây là để nó quét có bao nhiêu chữ
            //còn đối với dòng char là có nghĩa là lấy từng chữ còn chartAt(i)
            //là nó sẽ lấy từng chữ một trong dòng for ở trên bỏ vào và tạo thành từng dòng một
            if(Character.isUpperCase(ch)){
                //cái từ này là nó đạc từng chữ và tìm em có tù nào viết hoa không
                // thì nó sẽ đi xuống dưới và bắt đầu cộng một ở number_uppercasse
                number_uppercase++;


            }
        }
        System.out.println("The number of uppercase is :"+number_uppercase);


    }
}
