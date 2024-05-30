// An interface in Java allows a class to achieve multiple inheritance by enabling it to implement multiple interfaces. This means a single class can inherit behaviors and methods from multiple sources.

// Key Points:
// Multiple Inheritance: A class can implement more than one interface.
// Abstract Methods: Interfaces contain abstract methods that the implementing class must define.
// No Implementation: Interfaces cannot have instance fields or constructors.

// Interface for flying behavior
interface Flyable {
  void fly();
}

// Interface for swimming behavior
interface Swimmable {
  void swim();
}

// Class implementing both Flyable and Swimmable interfaces
class Duck implements Flyable, Swimmable {
  @Override
  public void fly() {
      System.out.println("Duck is flying");
  }

  @Override
  public void swim() {
      System.out.println("Duck is swimming");
  }
}

// Main class to test the interfaces and implementing class
public class exampleOfInterface {
  public static void main(String[] args) {
      Duck duck = new Duck();
      
      // Call methods defined in interfaces
      duck.fly();  // Output: Duck is flying
      duck.swim(); // Output: Duck is swimming
  }
}
