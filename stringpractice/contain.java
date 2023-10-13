package string;

import java.util.Scanner;

public class contain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.

        System.out.print("Enter string s1: "); // Prompt the user to enter the first string.
        String s1 = input.nextLine(); // Read the first string from the user.

        System.out.print("Enter string s2: "); // Prompt the user to enter the second string.
        String s2 = input.nextLine(); // Read the second string from the user.

        if (s1.contains(s2)) { // Check if the second string is a substring of the first string.
            System.out.println(s2 + " is a substring of " + s1); // Print if the second string is a substring.
        } else {
            System.out.println(s2 + " is not a substring of " + s1); // Print if the second string is not a substring.
        }
//        Enter string s1: ABCD
//        Enter string s2: ABC
//        ABC is a substring of ABCD
        input.close(); // Close the Scanner object to release resources.
    }
}

