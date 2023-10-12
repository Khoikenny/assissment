package questionaboutwhile;

import java.util.Scanner;

public class testdowhile {
    public static void main(String[] args) {
        int data;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(" enter the number you want");
            data = sc.nextInt();
            sum += data;

        }while (data != 0);
        System.out.println("so the sume is " + sum);
        //for (int k = 2; k <= n1 && k <= n2; k++) {
        // if (n1 % k == 0 && n2 % k == 0)
        // gcd = k;
    }
}
