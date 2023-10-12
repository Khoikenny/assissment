package stringpractice;

import java.util.Scanner;

public class hienthiocacvitrile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Display characters at odd positions
        System.out.print("Characters at odd positions: ");
        for (int i = 0; i < userInput.length(); i++) {
            if (i % 2 == 1) {
                //cái chia hết cho 2 ở đây chính là biển hiện là nó có là chữ chẵn hay không
                // còn nếu là một thì có nghĩa là số lẻ
                // I index is 0-based, so we check if it's even to get odd positions
                System.out.print(userInput.charAt(i));
            }
        }

    }
}
