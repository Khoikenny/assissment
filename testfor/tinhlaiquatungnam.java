package testfor;

import java.util.Scanner;

public class tinhlaiquatungnam {
    public static void main(String[] args) {
        //nhap sc
        Scanner sc = new Scanner(System.in);
        //nhap de vao 3 gia tri
        System.out.println("Enter the initial deposit amount : ");
        double initial_deposit_amount= sc.nextDouble();
        System.out.println("Enter annual percentage yield");
        double annual_percentage_yield = sc.nextDouble() ;
        System.out.println("Enter maturity period (number of months");
        int number_of_months = sc.nextInt();
        for(int m =1; m <=number_of_months;m++){
            double  CD = initial_deposit_amount *(annual_percentage_yield/1200);
            initial_deposit_amount += CD;
            System.out.printf("%3d \t %.1f%n",m , initial_deposit_amount);
        }

        //lam for
        //in ra su dung nhu bai kilogramstopounds
    }
}
