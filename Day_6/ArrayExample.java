// In Java, arrays are used to store multiple values of the same type in a single variable. Here are some examples of how to declare, initialize, and use arrays in Java:



public class ArrayExample {

  public static void main(String[] args) {
      // 1. Declaring and Initializing an Array
      // Example 1: Declaring an Array
      int[] myArray;
      myArray = new int[5]; // Instantiation of an array with 5 elements

      // Example 2: Declaring and Initializing an Array
      int[] anotherArray = new int[5]; // Declaring and instantiating an array with 5 elements

      // Example 3: Declaring, Initializing, and Assigning Values
      int[] yetAnotherArray = {1, 2, 3, 4, 5}; // Declaring, instantiating, and initializing with values

      // 2. Accessing Array Elements
      int[] accessArray = {10, 20, 30, 40, 50};
      System.out.println("Accessing Elements:");
      System.out.println(accessArray[0]); // Outputs 10
      System.out.println(accessArray[3]); // Outputs 40

      // 3. Modifying Array Elements
      int[] modifyArray = {10, 20, 30, 40, 50};
      modifyArray[1] = 25; // Changing the second element from 20 to 25
      System.out.println("\nModifying Elements:");
      System.out.println(modifyArray[1]); // Outputs 25

      // 4. Looping Through an Array
      // Example 1: Using a `for` Loop
      System.out.println("\nLooping Through Array with for Loop:");
      int[] loopArray = {1, 2, 3, 4, 5};
      for (int i = 0; i < loopArray.length; i++) {
          System.out.println(loopArray[i]);
      }

      // Example 2: Using a `for-each` Loop
      System.out.println("\nLooping Through Array with for-each Loop:");
      for (int element : loopArray) {
          System.out.println(element);
      }

      // 5. Multi-Dimensional Arrays
      // Example 1: Declaring and Initializing a Two-Dimensional Array
      int[][] twoDArray = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      // Example 2: Accessing Elements in a Two-Dimensional Array
      System.out.println("\nAccessing Elements in Two-Dimensional Array:");
      System.out.println(twoDArray[1][2]); // Outputs 6

      // Example 3: Looping Through a Two-Dimensional Array
      System.out.println("\nLooping Through Two-Dimensional Array:");
      for (int i = 0; i < twoDArray.length; i++) {
          for (int j = 0; j < twoDArray[i].length; j++) {
              System.out.print(twoDArray[i][j] + " ");
          }
          System.out.println();
      }
  }
}
