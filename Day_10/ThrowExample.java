// The throw keyword is used to explicitly throw an exception from a method or any block of code. It is followed by an instance of the Throwable class (or a subclass of Throwable).

public class ThrowExample {
  public static void main(String[] args) {
      try {
          checkAge(15);
      } catch (IllegalArgumentException e) {
          System.out.println("Exception caught: " + e.getMessage());
      }
  }

  // Method that throws an IllegalArgumentException if the age is less than 18
  public static void checkAge(int age) {
      if (age < 18) {
          throw new IllegalArgumentException("Age must be 18 or older.");
      }
      System.out.println("Age is valid.");
  }
}
