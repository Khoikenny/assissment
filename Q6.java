import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer between 100 and 999");
        int added_number = sc.nextInt();
        int first_digit = added_number % 10;
        added_number /= 10;
        int second_digit = added_number % 10;
        added_number /=10;
        int three_digit = added_number % 10;

        int sum_of_the_digits = first_digit + second_digit + three_digit;

        System.out.println("The sum is : " + sum_of_the_digits);
    }
}
