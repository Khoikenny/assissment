package assign1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        final double Kilometers_per_Liter = 0.425144;
        double MPG;
        Scanner inputLine = new Scanner(System.in);
        System.out.println(" Please enter MPG");
        MPG = inputLine.nextDouble();
        double total = MPG * Kilometers_per_Liter;
        System.out.printf("KM/L value is : %f\n", total);


    }
}