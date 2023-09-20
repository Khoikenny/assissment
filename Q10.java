import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if the number is divisible by both 5 and 6
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println(num + " is divisible by both 5 and 6.");
        }

        // Check if the number is divisible by either 5 or 6 (but not both)
        if ((num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0)) {
            System.out.println(num + " is divisible by either 5 or 6, but not both.");
        }
        if (num % 5 != 0 && num % 6 != 0){
            System.out.println(num + " is not divisible by either 5 or 6");

        }

        // Close the Scanner
        scanner.close();
    }
}
