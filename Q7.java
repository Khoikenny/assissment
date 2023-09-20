import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        double Vo, V1, t;
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Please enter v0, v1 and t:  ");
        Vo = inputLine.nextDouble();
        V1 = inputLine.nextDouble();
        t = inputLine.nextDouble();
        double total = (V1 - Vo) / t ;
        System.out.printf("The average acceleration is %.4f\n", total );
    }
}
