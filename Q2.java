package assign1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double M;
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Please enter Meal cost ");
        M = inputLine.nextDouble();
        System.out.println("Please enter Tip Percentage(i.e. 10 for 10%");
        double P= inputLine.nextDouble();
        double T= M / 100 * P;
        double total= T + M;
        System.out.printf(" Tip total is : %.2f\n total cost is $: %.2f\n ", T, total );
    }
}
