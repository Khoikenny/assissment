package questionaboutwhile;

import java.util.Scanner;

public class sentivelValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer ( the input ends if it is 0):");
        int data = sc.nextInt();
        int sum = 0;
        while(data != 0){
            sum += data;
            //  có thể viết bằng sum bằng sum + data
            System.out.println("enter the integer(the input ends if it is 0) :");
            data = sc.nextInt();
            //  có nghĩa là sau khi đi hết một vòng thì nó sẽ quay lại để tiếp tực nhập vào
            // nếu mà cái điều kiện của ta nó bằng 0 thì nó sẽ kết thúc vòng lập đó và
            // đi xuống tới vần kết thúc đó chính là cái sum mà ta muốn nó tính
        }
        System.out.println(" the sum is " + sum);

    }
}
