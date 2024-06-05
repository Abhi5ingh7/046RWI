public class SecondLargestElement {

  public static void main(String[] args) {
      int[] array = {12, 35, 1, 10, 34, 1};

      if (array.length < 2) {
          System.out.println("Array does not have enough elements to find the second largest element.");
      } else {
          int firstLargest = Integer.MIN_VALUE;
          int secondLargest = Integer.MIN_VALUE;

          // Find the largest element
          for (int num : array) {
              if (num > firstLargest) {
                  firstLargest = num;
              }
          }

          // Find the largest element less than the first largest
          for (int num : array) {
              if (num > secondLargest && num < firstLargest) {
                  secondLargest = num;
              }
          }

          if (secondLargest == Integer.MIN_VALUE) {
              System.out.println("There is no second largest element in the array.");
          } else {
              System.out.println("The second largest element in the array is: " + secondLargest);
          }
      }
  }
}

