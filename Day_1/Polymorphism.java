
// Polymorphism in Java is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It allows one interface to be used for a general class of actions, with specific actions defined by subclasses.

// Superclass
class Animal {
  // Method to be overridden
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

// Subclass 1
class Dog extends Animal {
  // Overriding the sound method
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }
}

// Subclass 2
class Cat extends Animal {
  // Overriding the sound method
  @Override
  public void sound() {
      System.out.println("Cat meows");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
      // Creating instances of Dog and Cat
      Animal myDog = new Dog();
      Animal myCat = new Cat();

      // Polymorphism in action
      myDog.sound();  // Calls the Dog's sound method
      myCat.sound();  // Calls the Cat's sound method
  }
}
