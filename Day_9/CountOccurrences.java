public class CountOccurrences {

  private static int recursiveCountOccurrences(String str, char ch, int ind) {
    // Base case: if the current index reaches the length of the string, return 0
    if (ind == str.length()) return 0;

    // Initialize count
    int cnt = 0;

    // If the current character matches the target character, increment the count
    if (str.charAt(ind) == ch) cnt++;

    // Return the count of the current character plus the count from the rest of the string
    return cnt + recursiveCountOccurrences(str, ch, ind + 1);
  }

  public static void main(String[] args) {
    // Call the recursive function to count occurrences of 's' in the string "Abhisheksingh"
    int cnt = recursiveCountOccurrences("Abhisheksingh", 's', 0);

    // Print the result
    System.out.println("Occurrences: " + cnt);
  }
}
