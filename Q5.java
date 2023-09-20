import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        final double pound = 0.454;
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double P = inputLine.nextDouble();
        double total= P * pound;
        System.out.printf(P +" pounds is: %.3f\n " ,total);

    }
}
