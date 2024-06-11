public class ArrayProblems1 {
  public static void reverseArray(int[] array) {
      int left = 0, right = array.length - 1;
      while (left < right) {
          int temp = array[left];
          array[left] = array[right];
          array[right] = temp;
          left++;
          right--;
      }
  }

  public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5};
      reverseArray(numbers);
      System.out.print("Reversed array: ");
      for (int num : numbers) {
          System.out.print(num + " ");
      }
      // Output: Reversed array: 5 4 3 2 1
  }
}
