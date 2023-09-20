import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the current Temperature in C( negative values only):");
       double C = sc.nextDouble();
        System.out.println("Please enter the Wind speed in km/h : ");
        double V = sc.nextDouble();
        double total =( 13.12 + 0.6215 * C - 11.37 * Math.pow(V, 0.16) + 0.3965 * C *  Math.pow(V, 0.16));
       System.out.printf(" It feel like %.0f\n C outside", total);
// sau dap an lai xuong dong
        if ( C >=0){
            System.out.println("Entered temperature must be a negative temperature");
        }
    }
}