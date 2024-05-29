// Encapsulation in Java is a mechanism of wrapping the data (variables) and code (methods) together as a single unit. It helps to protect the data from outside interference and misuse. By using encapsulation, we can restrict access to certain components of an object and can make the code more secure and maintainable.

// Class with encapsulation
class Person {
  // Private variables
  private String name;
  private int age;

  // Public getter method for name
  public String getName() {
      return name;
  }

  // Public setter method for name
  public void setName(String name) {
      this.name = name;
  }

  // Public getter method for age
  public int getAge() {
      return age;
  }

  // Public setter method for age
  public void setAge(int age) {
      // Adding validation logic
      if (age > 0) {
          this.age = age;
      } else {
          System.out.println("Please enter a valid age.");
      }
  }
}

public class Encapsulation {
  public static void main(String[] args) {
      // Creating an instance of Person
      Person person = new Person();

      // Setting values using setter methods
      person.setName("John");
      person.setAge(25);

      // Getting values using getter methods
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());

      // Trying to set an invalid age
      person.setAge(-5);  // This will trigger validation in the setter
  }
}
