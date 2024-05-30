// An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It serves as a blueprint for other classes.

// Key Points:
// Cannot Instantiate: You cannot create an object of an abstract class.
// Abstract Methods: It can have methods without implementation (abstract methods), which must be implemented by subclasses.
// Concrete Methods: It can also have fully implemented methods (concrete methods) that subclasses can inherit.
// Use: It's used to define common characteristics and behaviors for a group of related classes.

// Abstract class
abstract class Shape {
  // Abstract method (no implementation)
  public abstract double calculateArea();

  // Concrete method (with implementation)
  public void displayShape() {
      System.out.println("This is a shape");
  }
}

// Subclass (inherit from Shape)
class Circle extends Shape {
  private double radius;

  // Constructor
  public Circle(double radius) {
      this.radius = radius;
  }

  // Provide implementation for the abstract method
  @Override
  public double calculateArea() {
      return Math.PI * radius * radius;
  }
}

// Subclass (inherit from Shape)
class Rectangle extends Shape {
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  // Provide implementation for the abstract method
  @Override
  public double calculateArea() {
      return length * width;
  }
}

// Main class to test the abstract class and subclasses
public class exampleOfbstractClasses  {
  public static void main(String[] args) {
      // Create instances of Circle and Rectangle
      Circle circle = new Circle(5);
      Rectangle rectangle = new Rectangle(4, 6);

      // Call the abstract method calculateArea
      System.out.println("Circle area: " + circle.calculateArea()); // Output: Circle area: 78.53981633974483
      System.out.println("Rectangle area: " + rectangle.calculateArea()); // Output: Rectangle area: 24.0

      // Call the concrete method displayShape
      circle.displayShape(); // Output: This is a shape
      rectangle.displayShape(); // Output: This is a shape
  }
}
