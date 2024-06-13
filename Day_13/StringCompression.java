public class StringCompression {
  public static void main(String[] args) {
      String str = "aabcccccaaa";
      System.out.println(compressString(str)); // "a2b1c5a3"
  }

  public static String compressString(String str) {
      int n = str.length();
      if (n == 0) return str;

      StringBuilder compressed = new StringBuilder();
      int count = 1;

      for (int i = 1; i < n; i++) {
          if (str.charAt(i) == str.charAt(i - 1)) {
              count++;
          } else {
              compressed.append(str.charAt(i - 1)).append(count);
              count = 1;
          }
      }
      compressed.append(str.charAt(n - 1)).append(count);

      String compressedStr = compressed.toString();
      return compressedStr.length() < str.length() ? compressedStr : str;
  }
}
