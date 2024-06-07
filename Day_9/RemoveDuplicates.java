public class RemoveDuplicates {
  public static void main(String[] args) {
      String original = "programming";
      StringBuilder noDuplicates = new StringBuilder();

      for (int i = 0; i < original.length(); i++) {
          char c = original.charAt(i);
          if (noDuplicates.indexOf(String.valueOf(c)) == -1) {
              noDuplicates.append(c);
          }
      }

      System.out.println("String after removing duplicates: " + noDuplicates.toString());
  }
}

