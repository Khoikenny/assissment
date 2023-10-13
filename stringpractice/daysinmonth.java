package string;

import java.util.Scanner;

public class daysinmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Tạo một đối tượng Scanner để đọc dữ liệu đầu vào từ người dùng.

        System.out.print("Enter a year: "); // Yêu cầu người dùng nhập năm.
        int year = input.nextInt(); // Đọc năm được nhập từ người dùng.

        System.out.print("Enter a month: "); // Yêu cầu người dùng nhập tên tháng.
        String month = input.next(); // Đọc tên tháng được nhập từ người dùng.

        if (month.length() >= 3) { // Kiểm tra xem độ dài của chuỗi tháng có ít nhất 3 ký tự hay không.
            month = month.substring(0, 3); // Lấy ba ký tự đầu tiên của chuỗi tháng (chuyển đổi thành chữ hoa).
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // Mảng chứa các tên tháng.
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Mảng chứa số ngày tương ứng với mỗi tháng.

            boolean found = false; // Biến để kiểm tra xem tháng có hợp lệ hay không.
            for (int i = 0; i < 12; i++) {
                if (month.equals(months[i])) { // Kiểm tra xem tên tháng nhập vào có trong danh sách tháng hay không.
                    System.out.println(months[i] + " " + year + " has " + daysInMonth[i] + " days"); // In ra số ngày trong tháng tương ứng.
                    found = true; // Đánh dấu là đã tìm thấy tháng hợp lệ.
                    break; // Thoát khỏi vòng lặp khi tìm thấy tháng hợp lệ.
                }
            }

            if (!found) {
                System.out.println(month + " is not a correct month name"); // Thông báo nếu không tìm thấy tháng hợp lệ.
            }
        } else {
            System.out.println(month + " is not a correct month name"); // Thông báo nếu tên tháng không hợp lệ.
        }

        input.close(); // Đóng đối tượng Scanner để giải phóng tài nguyên.
    }
}

