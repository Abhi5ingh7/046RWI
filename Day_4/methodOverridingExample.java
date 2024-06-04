// In Java, method overriding allows a subclass to redefine the behavior of a method inherited from its superclass. This means the subclass can provide its own implementation for the inherited method, specializing it for the subclass's specific needs.

class Shape {
  public double getArea() {
      return 0.0; // Default implementation, may be overridden
  }
}

class Square extends Shape {
  private double side;

  public Square(double side) {
      this.side = side;
  }

  @Override
  public double getArea() {
      return side * side;
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  @Override
  public double getArea() {
      return Math.PI * radius * radius;
  }
}

public class methodOverridingExample {

  public static void main(String[] args) {
      Shape square = new Square(5);
      Shape circle = new Circle(3.5);

      System.out.println("Square Area: " + square.getArea());
      System.out.println("Circle Area: " + circle.getArea());
  }
}


