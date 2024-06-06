// In Java, a String is an object that represents a sequence of characters. Strings are used to store and manipulate text. They are immutable, meaning once a String object is created, it cannot be changed. Any modification to a String results in the creation of a new String object.

public class StringExample {
  public static void main(String[] args) {
      // Creating a String
      String greeting = "Hello, World!";
      
      // Printing the String
      System.out.println(greeting);
      
      // Getting the length of the String
      int length = greeting.length();
      System.out.println("The length of the string is: " + length);
      
      // Converting the String to uppercase
      String upperCaseGreeting = greeting.toUpperCase();
      System.out.println("Uppercase: " + upperCaseGreeting);
      
      // Checking if the String contains a specific sequence
      boolean containsWorld = greeting.contains("World");
      System.out.println("Does the string contain 'World'? " + containsWorld);
      
      // Replacing a part of the String
      String replacedGreeting = greeting.replace("World", "Java");
      System.out.println("Replaced String: " + replacedGreeting);
      
      // Extracting a substring
      String substring = greeting.substring(7, 12);
      System.out.println("Substring: " + substring);
      
      // Concatenating two Strings
      String concatenatedString = greeting + " Let's learn Java.";
      System.out.println("Concatenated String: " + concatenatedString);
  }
}

