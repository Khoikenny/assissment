import java.util.Scanner;

public class threenumber {
    public static void main(String[] args) {
        double a, b, c;
        Scanner inputLine = new Scanner(System.in);
        System.out.println("write the number a: ");
        a = inputLine.nextDouble();
        System.out.println("write the number b: ");
        b = inputLine.nextDouble();
        System.out.println("write the number c: ");
        c = inputLine.nextDouble();
         double largestNumber = a;
        if (a == b) {
            if (b == c) {
                System.out.println(" a = b = c = " + a);
            }
        } else if (b > largestNumber) {
            System.out.println(" b is the largest");
        } else if (c > largestNumber) {
            System.out.println("c is the highest");
        }
        System.out.println(" a is the highest");

    }

}

