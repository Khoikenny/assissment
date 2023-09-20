import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the month ( i.e 1=January) day of the month and the year");
        int Q = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();
        int J = (Y / 100);
        int K = ( Y % 100);
        int T = (Q + (26 * (M + 1) / 10) + K + (K / 4) + (J / 4) + (5 * J) % 7;
        switch (T) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("You right the wrong number");


        }
        System.out.println(" so the day is " + T);


    }
}
