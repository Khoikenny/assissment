package assign1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        final double F = 0.305;
        double feet;
        double x;
        System.out.println(" Enter a value for feet: ");
        Scanner inputLine = new Scanner(System.in);
        feet = inputLine.nextDouble();
        x = feet * F;
        System.out.printf(" %.1f\n feel is : %.2f\n ",feet, x);
    }
}

