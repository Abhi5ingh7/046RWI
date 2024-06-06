// here is most commonly used String methods in Java:

// 1. length()
// Returns the length of the string.

// 2. charAt(int index)
// Returns the character at the specified index.

// 3. substring(int beginIndex, int endIndex)
// Returns a new string that is a substring of the original string.

// 4. equals(Object anObject)
// Compares this string to the specified object for equality.

// 5. contains(CharSequence s)
// Returns true if and only if this string contains the specified sequence of char values.

// 6. toLowerCase()
// Converts all of the characters in this string to lower case.

// 7. toUpperCase()
// Converts all of the characters in this string to upper case.

// 8. trim()
// Returns a string whose value is this string, with any leading and trailing whitespace removed.

// 9. replace(CharSequence target, CharSequence replacement)
// Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.

// 10. split(String regex)
// Splits this string around matches of the given regular expression.

public class StringMethodsExample {
  public static void main(String[] args) {
      String str = "Hello, World!";
      
      // length()
      System.out.println("Length: " + str.length());
      
      // charAt()
      System.out.println("Character at index 1: " + str.charAt(1));
      
      // substring()
      System.out.println("Substring (7, 12): " + str.substring(7, 12));
      
      // equals()
      System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
      
      // contains()
      System.out.println("Contains 'World': " + str.contains("World"));
      
      // toLowerCase()
      System.out.println("Lowercase: " + str.toLowerCase());
      
      // toUpperCase()
      System.out.println("Uppercase: " + str.toUpperCase());
      
      // trim()
      String strWithSpaces = "   Hello, World!   ";
      System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");
      
      // replace()
      System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
      
      // split()
      String[] parts = str.split(", ");
      System.out.println("Split: " + java.util.Arrays.toString(parts));
  }
}
