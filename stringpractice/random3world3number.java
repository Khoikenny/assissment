package string;

import java.util.Random;

public class random3world3number {
    public static void main(String[] args) {
        String plateNumber = generatePlateNumber();
        System.out.println("Số biển kiểm soát xe được tạo: " + plateNumber);
    }

    public static String generatePlateNumber() {
        Random random = new Random();

        // Tạo ba chữ cái in hoa ngẫu nhiên
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char letter = (char) (random.nextInt(26) + 'A');
            letters.append(letter);
        }

        // Tạo bốn chữ số ngẫu nhiên
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            digits.append(digit);
        }
//        Số biển kiểm soát xe được tạo: QER6219

        return letters.toString() + digits.toString();
    }
}

