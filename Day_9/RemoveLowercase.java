public class RemoveLowercase {
  public static void main(String[] args) {
      String input = "AbhishekSingh";

      // Remove all lowercase characters
      String result = input.replaceAll("[a-z]", "");

      // Print the result
      System.out.println("String after removing lowercase characters: " + result);
  }
}
