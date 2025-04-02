package org.example.javacore;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that might cause an exception
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());  // Output: Error: / by zero
        } finally {
            // This block will always execute, regardless of whether an exception occurred
            System.out.println("This will always execute.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
