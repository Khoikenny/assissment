import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner inputLine= new Scanner(System.in);
        System.out.println("you need to choose the number from 0 to 8 : ");
        int i = inputLine.nextInt();
        double total= Math.pow(2, i);
        System.out.println(" The display the powers of 2 from 0 up to 8 : " + total);

    }
}
