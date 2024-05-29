// Inheritance is the process by which one class inherits the functions and properties of another class. The main function of inheritance is the reusability of code. Each subclass only has to define its features. The rest of the features can be derived directly from the parent class.

// Single Inheritance
class Animal {
  void eat() {
      System.out.println("Eating...");
  }
}

// Multilevel Inheritance
class Mammal extends Animal {
  void walk() {
      System.out.println("Walking...");
  }
}

// Hierarchical Inheritance
class Dog extends Mammal {
  void bark() {
      System.out.println("Barking...");
  }
}

class Cat extends Mammal {
  void meow() {
      System.out.println("Meowing...");
  }
}

// Multiple Inheritance (achieved using interfaces)
interface Pet {
  void play();
}

class Labrador extends Dog implements Pet {
  public void play() {
      System.out.println("Playing...");
  }
}

public class Inheritance {
  public static void main(String[] args) {
      // Single Inheritance
      Animal animal = new Animal();
      animal.eat();

      // Multilevel Inheritance
      Mammal mammal = new Mammal();
      mammal.eat();
      mammal.walk();

      // Hierarchical Inheritance
      Dog dog = new Dog();
      dog.eat();
      dog.walk();
      dog.bark();

      Cat cat = new Cat();
      cat.eat();
      cat.walk();
      cat.meow();

      // Multiple Inheritance using Interfaces
      Labrador labrador = new Labrador();
      labrador.eat();
      labrador.walk();
      labrador.bark();
      labrador.play();
  }
}
