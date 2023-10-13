package string;

import java.util.Scanner; // Import thư viện Scanner để đọc đầu vào từ người dùng

public class giatrifuture { // Khai báo lớp FutureInvestmentValue
    public static void main(String[] args) { // Khai báo phương thức main
        Scanner input = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        System.out.print("Số tiền đầu tư: "); // Hiển thị thông báo yêu cầu nhập số tiền đầu tư
        double investmentAmount = input.nextDouble(); // Đọc giá trị số tiền đầu tư từ người dùng

        System.out.print("Lãi suất hàng năm: "); // Hiển thị thông báo yêu cầu nhập lãi suất hàng năm
        double annualInterestRate = input.nextDouble(); // Đọc giá trị lãi suất hàng năm từ người dùng

        System.out.println("Năm     Giá trị tương lai"); // In ra tiêu đề của bảng

        for (int i = 1; i <= 30; i++) { // Bắt đầu vòng lặp từ 1 đến 30
            double monthlyInterestRate = annualInterestRate / 1200; // Tính tỷ lệ lãi suất hàng tháng
            int months = i * 12; // Tính số tháng
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, months); // Tính giá trị tương lai dựa trên công thức
            System.out.printf("%-8d%-16.2f\n", i, futureValue); // In ra giá trị tương lai theo định dạng cố định
        }
    }
}

