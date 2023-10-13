package string;


import java.util.Scanner; // Import thư viện Scanner để đọc dữ liệu đầu vào từ người dùng

public class controngchucobaonhieu { // Khai báo lớp CountLetters
    public static void main(String[] args) { // Phương thức main
        Scanner input = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        System.out.print("Nhập vào một chuỗi: "); // Hiển thị thông báo yêu cầu người dùng nhập chuỗi
        String str = input.nextLine(); // Đọc chuỗi từ người dùng

        int count = 0; // Khởi tạo biến đếm số lượng chữ cái
        for (int i = 0; i < str.length(); i++) { // Duyệt qua từng ký tự trong chuỗi
            char ch = str.charAt(i); // Lấy ký tự tại vị trí i
            // Kiểm tra nếu ký tự là chữ cái (a-z hoặc A-Z) thì tăng biến đếm lên 1
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            }
        }
        // In ra số lượng chữ cái trong chuỗi
        System.out.println("Số lượng chữ cái trong chuỗi: " + count);
    }
}

