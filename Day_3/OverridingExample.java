// Method overriding in Java occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The method in the subclass should have the same name, return type, and parameter list as the method in the superclass.

class Animal {
  // Superclass method
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  // Subclass overrides the superclass method
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  // Subclass overrides the superclass method
  @Override
  public void sound() {
      System.out.println("Cat meows");
  }
}

public class OverridingExample {
  public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create an Animal object
      Animal myDog = new Dog();        // Create a Dog object
      Animal myCat = new Cat();        // Create a Cat object

      myAnimal.sound(); // Calls the method from Animal class
      myDog.sound();    // Calls the overridden method from Dog class
      myCat.sound();    // Calls the overridden method from Cat class
  }
}

