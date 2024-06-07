// public class PalindromeCheck {
//   public static void main(String[] args) {
//       String original = "madam";
      
//       // Using StringBuilder to reverse the string
//       StringBuilder sb = new StringBuilder(original);
//       String reversed = sb.reverse().toString();
      
//       // Check if the original string is equal to the reversed string
//       if (original.equals(reversed)) {
//           System.out.println(original + " is a palindrome.");
//       } else {
//           System.out.println(original + " is not a palindrome.");
//       }
//   }
// }

// Using Recursion---------------------------------------------------------------->
// public class PalindromeCheck {
//     public static boolean isPalindrome(String str, int start, int end) {
//         if (start >= end) {
//             return true;
//         }
//         if (str.charAt(start) != str.charAt(end)) {
//             return false;
//         }
//         return isPalindrome(str, start + 1, end - 1);
//     }
    
//     public static void main(String[] args) {
//         String original = "madam";
        
//         if (isPalindrome(original, 0, original.length() - 1)) {
//             System.out.println(original + " is a palindrome.");
//         } else {
//             System.out.println(original + " is not a palindrome.");
//         }
//     }
// }


public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "madam";
        boolean isPalindrome = true;
        
        int length = original.length();
        for (int i = 0; i < length / 2; i++) {
            if (original.charAt(i) != original.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
