package questionaboutwhile;

import java.util.Scanner;

public class greastcommondivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        int n1 = sc.nextInt();
        System.out.println("Enter second integer");
        int n2 = sc.nextInt();
        int Gcd =1;
        int k = 2;
        while( k <= n1 && k <= n2){
            //có nghĩa là khi mà nó kiểm tra bội ước lớn nhất thì bắt buộc K nó phải lớn hơn một nếu
            // không thì số lớn nhất sẽ là số một nên nó phải lớn hơn 2
            if (n1 % k ==0 && n2 % k ==0)
                // có nghĩa là khi mà ta có số của n1 và n2 có nghĩa là nó sẽ bắt đầu tính
                // k xem nó có chia hết cho n1 và n2 không và lập lại nó cho đến khi mà
            // nó có thể đáp ứng được 2 điều kiện là có thể chia hết cả n1 và n2
                Gcd = k;
            k++;
            // vì ta có k++ có nghĩa là khi mà ta có bội ước nhỏ mà điều chia hết cho cả 2 nhưng nó sẽ
            // vẫn sẽ tiếp tục cho đến khi nó tới số cuối cùng vì ta có GCD = k nó sẽ tiếp tục cập nhâp
            // cho đến khi mà số cao nhất cho đến khi số cuối có thể chia hết cho cả 2 biến
            }
        System.out.println("the greatest common divisor for " + n1 + " and " + n2 + " is " +Gcd);
        }
    }
