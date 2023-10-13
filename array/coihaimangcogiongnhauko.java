package array;

import java.util.Scanner; // Import thư viện Scanner để đọc dữ liệu đầu vào từ người dùng

public class coihaimangcogiongnhauko { // Khai báo lớp IdenticalArrays
    public static void main(String[] args) { // Phương thức main
        Scanner input = new Scanner(System.in); // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        // Nhập danh sách thứ nhất
        System.out.print("Nhập kích thước và nội dung của danh sách thứ nhất: ");
        int size1 = input.nextInt(); // Đọc kích thước của danh sách thứ nhất từ người dùng
        int[] list1 = new int[size1]; // Khai báo mảng list1 với kích thước đã chỉ định
        for (int i = 0; i < size1; i++) { // Vòng lặp để nhập các phần tử của danh sách thứ nhất
            list1[i] = input.nextInt(); // Đọc phần tử tại vị trí i từ người dùng
        }

        // Nhập danh sách thứ hai
        System.out.print("Nhập kích thước và nội dung của danh sách thứ hai: ");
        int size2 = input.nextInt(); // Đọc kích thước của danh sách thứ hai từ người dùng
        int[] list2 = new int[size2]; // Khai báo mảng list2 với kích thước đã chỉ định
        for (int i = 0; i < size2; i++) { // Vòng lặp để nhập các phần tử của danh sách thứ hai
            list2[i] = input.nextInt(); // Đọc phần tử tại vị trí i từ người dùng
        }

        // Kiểm tra xem hai danh sách có giống nhau không
        boolean isIdentical = true; // Khởi tạo biến đánh dấu tính đồng nhất ban đầu là true
        if (size1 != size2) { // Nếu hai danh sách có kích thước khác nhau
            isIdentical = false; // Đánh dấu là không đồng nhất
        } else { // Nếu cả hai danh sách có cùng kích thước
            for (int i = 0; i < size1; i++) { // Duyệt qua từng phần tử của danh sách
                if (list1[i] != list2[i]) { // Nếu phần tử tại vị trí i không giống nhau
                    isIdentical = false; // Đánh dấu là không đồng nhất
                    break; // Thoát khỏi vòng lặp
                }
            }
        }

        // In kết quả tương ứng
        if (isIdentical) { // Nếu hai danh sách giống nhau
            System.out.println("Hai danh sách giống nhau");
        } else { // Nếu hai danh sách không giống nhau
            System.out.println("Hai danh sách không giống nhau");
        }
    }
}
