public class CountOccurrences {
  public static void main(String[] args) {
      String str = "hello hello world";
      String sub = "hello";
      System.out.println(countOccurrences(str, sub)); // 2
  }

  public static int countOccurrences(String str, String sub) {
      if (sub.length() == 0) return 0;
      int count = 0;
      int idx = 0;
      while ((idx = str.indexOf(sub, idx)) != -1) {
          count++;
          idx += sub.length();
      }
      return count;
  }
}
