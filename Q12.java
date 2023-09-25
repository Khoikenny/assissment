package assign1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the month ( i.e 1=January) day of the month and the year");
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int Y = sc.nextInt();
        if(M == 1){

            M=13;
            Y-=1;
        }
        if(M==2){
            M=14;
            Y-=1;
        }

        int J = (Y / 100);
        int K = ( Y % 100);
        int T = (Q + (26 * (M + 1) / 10) + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        switch (T) {
            case 0:
                System.out.println("Saturday (0)");
                break;
            case 1:
                System.out.println("Sunday (1)");
                break;
            case 2:
                System.out.println("Monday (2)");
                break;
            case 3:
                System.out.println("Tuesday (3)");
                break;
            case 4:
                System.out.println("Wednesday (4)");
                break;
            case 5:
                System.out.println("Thursday (5) ");
                break;
            case 6:
                System.out.println("Friday (6) ");
                break;
            default:
                System.out.println("You right the wrong number");


        }


    }
}