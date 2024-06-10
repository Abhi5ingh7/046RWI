public class ArithmeticExceptionExample {
  public static void main(String[] args) {
      try {
          // Attempt to divide by zero
          int numerator = 10;
          int denominator = 0;
          int result = divide(numerator, denominator);
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          // Handle the exception
          System.out.println("Exception caught: " + e);
      } finally {
          System.out.println("Finally block executed.");
      }
  }

  // Method that performs division and may throw an ArithmeticException
  public static int divide(int a, int b) throws ArithmeticException {
      return a / b;
  }
}

