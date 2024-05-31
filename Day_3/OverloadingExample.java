
// Overloading in Java refers to the ability to define multiple methods with the same name but different parameter lists. This can involve different numbers of parameters, different types of parameters, or both. Overloading is a form of polymorphism that allows a class to have more than one method with the same name but different behavior based on the method signatures.

public class OverloadingExample {

  // Overloaded method with one integer parameter
  public void display(int a) {
      System.out.println("Method with one integer parameter: " + a);
  }

  // Overloaded method with two integer parameters
  public void display(int a, int b) {
      System.out.println("Method with two integer parameters: " + a + ", " + b);
  }

  // Overloaded method with one string parameter
  public void display(String a) {
      System.out.println("Method with one string parameter: " + a);
  }

  // Overloaded method with one integer and one string parameter
  public void display(int a, String b) {
      System.out.println("Method with one integer and one string parameter: " + a + ", " + b);
  }

  public static void main(String[] args) {
      OverloadingExample example = new
      OverloadingExample();

      // Calling the different overloaded methods
      example.display(10);
      example.display(20, 30);
      example.display("Hello");
      example.display(40, "World");
  }
}

