package string;

import java.util.Scanner;
//

    public class Sortthreeintegers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhập ba số nguyên: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            // Sắp xếp ba số nguyên theo thứ tự không giảm
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.println("Ba số nguyên theo thứ tự không giảm là: " + num1 + " " + num2 + " " + num3);

            input.close(); // Đóng Scanner
        }
    }

