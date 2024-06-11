public class ArrayProblems2 {
  public static int findSum(int[] array) {
      int sum = 0;
      for (int num : array) {
          sum += num;
      }
      return sum;
  }

  public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5};
      System.out.println("The sum of the elements is: " + findSum(numbers)); // Output: The sum of the elements is: 15
  }
}

