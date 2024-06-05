import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = scanner.nextLine();

        // For Loop Example
        System.out.println("\nFor Loop Example:");
        boolean isPalindromeFor = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindromeFor = false;
                break;
            }
        }
        if (isPalindromeFor) {
            System.out.println(str + " is a palindrome (Checked using for loop).");
        } else {
            System.out.println(str + " is not a palindrome (Checked using for loop).");
        }

        // While Loop Example
        System.out.println("\nWhile Loop Example:");
        boolean isPalindromeWhile = true;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindromeWhile = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindromeWhile) {
            System.out.println(str + " is a palindrome (Checked using while loop).");
        } else {
            System.out.println(str + " is not a palindrome (Checked using while loop).");
        }

        // Do-While Loop Example
        System.out.println("\nDo-While Loop Example:");
        boolean isPalindromeDoWhile = true;
        left = 0;
        right = length - 1;
        if (length == 0) {
            isPalindromeDoWhile = false;
        } else {
            do {
                if (str.charAt(left) != str.charAt(right)) {
                    isPalindromeDoWhile = false;
                    break;
                }
                left++;
                right--;
            } while (left < right);
        }
        if (isPalindromeDoWhile) {
            System.out.println(str + " is a palindrome (Checked using do-while loop).");
        } else {
            System.out.println(str + " is not a palindrome (Checked using do-while loop).");
        }

        scanner.close();
    }
}

// For Loop:

// Syntax: for (initialization; condition; update) { // statements }
// Use Case: When you know in advance how many times you need to iterate.
// Example: Checking if a string is a palindrome by comparing characters from both ends towards the center.
// In Code: for (int i = 0; i < length / 2; i++) { // statements }

// While Loop:

// Syntax: while (condition) { // statements }
// Use Case: When the number of iterations is not known beforehand and depends on a condition.
// Example: Similar palindrome check as the for loop, but using a while loop to compare characters until the condition is met.
// In Code: while (left < right) { // statements }

// Do-While Loop:

// Syntax: do { // statements } while (condition);
// Use Case: When you need the loop to execute at least once before checking the condition.
// Example: Similar palindrome check, ensuring at least one comparison is made.
// In Code: do { // statements } while (left < right);