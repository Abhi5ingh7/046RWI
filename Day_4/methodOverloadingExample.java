// In Java, method overloading allows you to define multiple methods in a class with the same name but different parameter lists. This enables you to create methods that perform similar operations but accept different types or numbers of arguments. The compiler determines which overloaded method to call based on the number and data types of the arguments provided in the method call.

class Shape {

  public double area(int side) {
      // Calculate area of a square
      return side * side;
  }

  public double area(double length, double width) {
      // Calculate area of a rectangle
      return length * width;
  }

  public double area(double radius) {
      // Calculate area of a circle
      return Math.PI * radius * radius;
  }
}

public class methodOverloadingExample {

  public static void main(String[] args) {
      Shape shape = new Shape();

      double squareArea = shape.area(5);
      double rectangleArea = shape.area(10, 6);
      double circleArea = shape.area(3.5);

      System.out.println("Square Area: " + squareArea);
      System.out.println("Rectangle Area: " + rectangleArea);
      System.out.println("Circle Area: "  + circleArea);
  }
}
