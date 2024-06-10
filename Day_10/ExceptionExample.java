// In Java, an exception is an event that disrupts the normal flow of the program's instructions. It is an object that wraps an error event that occurred within a method and contains:

// Information about the error including its type.
// The state of the program when the error occurred.
// Optional custom information.
// Java has a robust exception-handling framework that allows developers to handle errors in a controlled manner. Exceptions can be caught and handled to ensure that the program continues to run smoothly or fails gracefully.

// Types of Exceptions
// Checked Exceptions: These are exceptions that are checked at compile-time. For example, IOException, SQLException.
// Unchecked Exceptions: These are exceptions that occur at runtime and are not checked at compile-time. For example, ArithmeticException, NullPointerException.
// Errors: These are serious problems that a reasonable application should not try to catch. For example, OutOfMemoryError, StackOverflowError.
// Exception Handling Mechanisms
// Java provides five keywords that are used in exception handling:

// try: Block of code to monitor for exceptions.
// catch: Block of code to handle the exception.
// finally: Block of code that will always execute after the try block, regardless of whether an exception was thrown or not.
// throw: Used to explicitly throw an exception.
// throws: Used to declare an exception.


import java.io.*;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            FileInputStream file = new FileInputStream("nonexistentfile.txt");
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            // Trying to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        }
    }

    // Method that throws an ArithmeticException
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
