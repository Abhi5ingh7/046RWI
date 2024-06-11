public class ArrayProblems3 {
  public static boolean isSorted(int[] array) {
      for (int i = 1; i < array.length; i++) {
          if (array[i] < array[i - 1]) {
              return false;
          }
      }
      return true;
  }

  public static void main(String[] args) {
      int[] numbers1 = {1, 2, 3, 4, 5};
      int[] numbers2 = {1, 3, 2, 4, 5};
      System.out.println("Array 1 is sorted: " + isSorted(numbers1)); // Output: Array 1 is sorted: true
      System.out.println("Array 2 is sorted: " + isSorted(numbers2)); // Output: Array 2 is sorted: false
  }
}
