// Abstraction in Java is a fundamental concept in object-oriented programming (OOP) that allows you to hide the complex implementation details and show only the essential features of an object. Abstraction is achieved using abstract classes and interfaces.

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void sound();
  
  // Regular method
  public void sleep() {
      System.out.println("This animal is sleeping");
  }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
  public void sound() {
      System.out.println("The dog barks");
  }
}

public class Abtraction {
  public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.sound();  // Calls the abstract method
      myDog.sleep();  // Calls the regular method
  }
}
