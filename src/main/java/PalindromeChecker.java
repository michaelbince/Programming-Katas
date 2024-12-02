import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Check if the string is the same forward and backward
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Found characters that do not match
            }
            left++;   // Move left index towards the center
            right--;  // Move right index towards the center
        }

        return true; // All characters matched, it's a palindrome
    }
}