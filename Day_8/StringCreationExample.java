// String Literal: Creating a String using double quotes, e.g., String str1 = "Hello, World!";.

// Using the new Keyword: Explicitly creating a new String object using the new keyword, e.g., String str2 = new String("Hello, World!");.

// Using Character Array: Creating a String from a character array, e.g., char[] charArray = {'H', 'e', 'l', 'l', 'o'}; String str3 = new String(charArray);.

// Using Byte Array: Creating a String from a byte array, e.g., byte[] byteArray = {72, 101, 108, 108, 111}; String str4 = new String(byteArray);.

// Using StringBuilder or StringBuffer: Creating a String from a StringBuilder or StringBuffer object, e.g., StringBuilder sb = new StringBuilder("Hello"); String str5 = sb.toString();.

// Using String.valueOf Method: Converting different types (like int, float, char, etc.) into a String, e.g., int num = 100; String str7 = String.valueOf(num);.


public class StringCreationExample {
  public static void main(String[] args) {
      // Using String literal
      String str1 = "Hello, World!";
      System.out.println("String literal: " + str1);
      
      // Using new keyword
      String str2 = new String("Hello, World!");
      System.out.println("Using new keyword: " + str2);
      
      // Using character array
      char[] charArray = {'H', 'e', 'l', 'l', 'o'};
      String str3 = new String(charArray);
      System.out.println("Using character array: " + str3);
      
      // Using byte array
      byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for 'H', 'e', 'l', 'l', 'o'
      String str4 = new String(byteArray);
      System.out.println("Using byte array: " + str4);
      
      // Using StringBuilder
      StringBuilder sb = new StringBuilder("Hello");
      String str5 = sb.toString();
      System.out.println("Using StringBuilder: " + str5);
      
      // Using StringBuffer
      StringBuffer sbf = new StringBuffer("Hello");
      String str6 = sbf.toString();
      System.out.println("Using StringBuffer: " + str6);
      
      // Using String.valueOf
      int num = 100;
      String str7 = String.valueOf(num);
      System.out.println("Using String.valueOf: " + str7);
  }
}

