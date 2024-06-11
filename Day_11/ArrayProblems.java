public class ArrayProblems {
  public static int findMax(int[] array) {
      int max = array[0];
      for (int i = 1; i < array.length; i++) {
          if (array[i] > max) {
              max = array[i];
          }
      }
      return max;
  }

  public static void main(String[] args) {
      int[] numbers = {3, 5, 7, 2, 8, 9, 1};
      System.out.println("The maximum value is: " + findMax(numbers)); // Output: The maximum value is: 9
  }
}
