package testfor;
//Tất nhiên, dưới đây là một chương trình Java đơn giản để chuyển
// đổi một giá trị thập phân từ 0 đến 15 sang dạng thập lục phân tương ứng
// . Dưới đây là một ví dụ về chương trình:
import java.util.Scanner;

public class dangthapphan {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một giá trị thập phân từ 0 đến 15
        System.out.print("Nhập một giá trị thập phân (từ 0 đến 15): ");
        int decimalValue = scanner.nextInt();

        // Kiểm tra xem giá trị nhập vào có nằm trong khoảng hợp lệ (từ 0 đến 15) không
        if (decimalValue >= 0 && decimalValue <= 15) {
            // Chuyển đổi giá trị thập phân sang dạng thập lục phân và hiển thị nó
            String hexValue = Integer.toHexString(decimalValue).toUpperCase();
            System.out.println("Giá trị thập lục phân tương ứng là " + hexValue);
        } else {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập một giá trị thập phân từ 0 đến 15.");
        }
        //Enter a decimal value (0 to 15): 11
        //The hex value is B

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
