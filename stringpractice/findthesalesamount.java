package string;

import java.util.Scanner; // Import thư viện Scanner để đọc đầu vào từ người dùng

public class findthesalesamount { // Khai báo lớp FindSalesAmount
    public static void main(String[] args) { // Khai báo hàm main
        final double BASE_SALARY = 5000; // Khai báo mức lương cơ bản là 5000 đô la
        double commissionSought; // Khai báo biến commissionSought để lưu giá trị hoa hồng mong muốn

        Scanner input = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        System.out.print("Nhập số tiền hoa hồng mong muốn: "); // Hiển thị thông báo yêu cầu người dùng nhập số tiền hoa hồng mong muốn
        commissionSought = input.nextDouble(); // Đọc giá trị hoa hồng mong muốn từ người dùng

        double salesAmount = 0; // Khởi tạo biến salesAmount để lưu số tiền bán hàng
        double commission = 0; // Khởi tạo biến commission để lưu giá trị hoa hồng

        for (int i = 1; ; i++) { // Bắt đầu vòng lặp for, i tăng dần
            if (i <= 5000) { // Nếu số bán hàng nhỏ hơn hoặc bằng 5000
                commission = i * 0.08; // Tính giá trị hoa hồng dựa trên mức lương cơ bản và tỷ lệ hoa hồng cho phần đầu tiên
            } else if (i <= 10000) { // Nếu số bán hàng lớn hơn 5000 và nhỏ hơn hoặc bằng 10000
                commission = 5000 * 0.08 + (i - 5000) * 0.10; // Tính giá trị hoa hồng dựa trên mức lương cơ bản và tỷ lệ hoa hồng cho phần tiếp theo
            } else { // Trường hợp còn lại khi số bán hàng lớn hơn 10000
                commission = 5000 * 0.08 + 5000 * 0.10 + (i - 10000) * 0.12; // Tính giá trị hoa hồng dựa trên mức lương cơ bản và tỷ lệ hoa hồng cho phần cuối cùng
            }
            salesAmount = BASE_SALARY + commission; // Tính toán tổng số tiền bán hàng bao gồm mức lương cơ bản và hoa hồng

            if (commission >= commissionSought) { // Nếu giá trị hoa hồng đạt hoặc vượt qua mức hoa hồng mong muốn
                System.out.printf("Số tiền bán hàng là: %.2f", salesAmount); // In ra số tiền bán hàng cần thiết để đạt được hoa hồng mong muốn
                break; // Thoát khỏi vòng lặp
            }
        }
        input.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên
    }
}

