package testfor;

import java.util.Scanner;

public class hextobinary {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một chữ số thập lục phân
        System.out.print("Nhập một chữ số thập lục phân: ");
        String hexDigit = scanner.nextLine().toLowerCase(); // Chuyển đổi sang chữ thường để không phân biệt chữ hoa và chữ thường

        // Chuyển đổi chữ số thập lục phân thành số nhị phân
        String binaryValue = "";

        switch (hexDigit) {
            case "0":
                binaryValue = "0000";
                break;
            case "1":
                binaryValue = "0001";
                break;
            case "2":
                binaryValue = "0010";
                break;
            case "3":
                binaryValue = "0011";
                break;
            case "4":
                binaryValue = "0100";
                break;
            case "5":
                binaryValue = "0101";
                break;
            case "6":
                binaryValue = "0110";
                break;
            case "7":
                binaryValue = "0111";
                break;
            case "8":
                binaryValue = "1000";
                break;
            case "9":
                binaryValue = "1001";
                break;
            case "a":
                binaryValue = "1010";
                break;
            case "b":
                binaryValue = "1011";
                break;
            case "c":
                binaryValue = "1100";
                break;
            case "d":
                binaryValue = "1101";
                break;
            case "e":
                binaryValue = "1110";
                break;
            case "f":
                binaryValue = "1111";
                break;
            default:
                System.out.println(hexDigit + " là đầu vào không hợp lệ.");
                break;
        }

        if (!binaryValue.isEmpty()) {
            System.out.println("Giá trị nhị phân tương ứng là " + binaryValue);
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
