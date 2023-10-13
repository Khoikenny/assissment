package string;

public class total2number {
    public static void main(String[] args) {
        int count = 0; // Biến để theo dõi tổng số tổ hợp

        // Duyệt qua tất cả các tổ hợp có thể của hai số từ 1 đến 7
        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + " " + j);
                count++; // Tăng biến đếm cho mỗi tổ hợp
            }
        }

        System.out.println("Tổng số tất cả các tổ hợp là " + count);
    }
}

