package assign1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        System.out.println("The Addition sign represents the number  : 1 ");
        System.out.println("The Subtraction sign represents the number  : 2 ");
        System.out.println("The multiplication sign represents the number  : 3");
        System.out.println("The Division  sign represents the number : 4 ");

        System.out.println("Please write the number1 : ");
        int H = inputLine.nextInt();
        System.out.println("Please write the number2 : ");
        int T = inputLine.nextInt();
        System.out.println(" Operation the sign you want to do");
        int S = inputLine.nextInt();

        if (S == 1) {
            double total = (H + T);
            System.out.println("so the number is " + total);
        } else if (S == 2) {
            double total = (H - T);
            System.out.println("so the number is " + total);
        } else if (S == 3) {
            double total = (H * T);
            System.out.println("so the number is " + total);

        } else if (S == 4) {
            double total = (H / T);
            System.out.println("so the number is " + total);
        }else {
            // cos the them gia tri neu nhu ma S lon hon 4
            System.out.println("so the number is " + H);
        }


    }
}

