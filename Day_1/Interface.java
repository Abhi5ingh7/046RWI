// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Methods in interfaces are abstract by default.


// Interface
interface Animal {
  void sound();  // Interface method (does not have a body)
  void sleep();  // Interface method (does not have a body)
}

// Implement the Animal interface in Dog class
class Dog implements Animal {
  public void sound() {
      System.out.println("The dog barks");
  }

  public void sleep() {
      System.out.println("This animal is sleeping");
  }
}

public class Interface {
  public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.sound();  // Calls the interface method
      myDog.sleep();  // Calls the interface method
  }
}
