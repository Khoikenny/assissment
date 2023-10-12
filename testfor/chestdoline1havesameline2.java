package testfor;
//kiểm tra xem tập hợp line2 có giống với line1 hay ko
import java.util.Scanner;

public class chestdoline1havesameline2 {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi thứ nhất
        System.out.print("Nhập chuỗi thứ nhất: ");
        String chuoi1 = scanner.nextLine();

        // Yêu cầu người dùng nhập chuỗi thứ hai
        System.out.print("Nhập chuỗi thứ hai: ");
        String chuoi2 = scanner.nextLine();

        // Kiểm tra xem chuỗi2 có phải là chuỗi con của chuỗi1 không
        if (chuoi1.contains(chuoi2)) {
            System.out.println("'" + chuoi2 + "' là chuỗi con của '" + chuoi1 + "'.");
        } else {
            System.out.println("'" + chuoi2 + "' không phải là chuỗi con của '" + chuoi1 + "'.");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
