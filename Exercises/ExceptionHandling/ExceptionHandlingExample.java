package Exercises.ExceptionHandling;

public class ExceptionHandlingExample {
    // Example exceptions in Java include:
    // - NullPointerException: Thrown when an application attempts to use null where
    // an object is required.
    // - ArrayIndexOutOfBoundsException: Thrown to indicate that an array has been
    // accessed with an illegal index.
    // - ArithmeticException: Thrown when an exceptional arithmetic condition has
    // occurred (e.g., divide by zero).
    // - NumberFormatException: Thrown to indicate that the application has
    // attempted to convert a string to a numeric type, but that the string does not
    // have the appropriate format.
    // - IOException: Signals that an I/O exception of some sort has occurred.
    // - FileNotFoundException: Signals that an attempt to open the file denoted by
    // a specified pathname has failed.
    // - IllegalArgumentException: Thrown to indicate that a method has been passed
    // an illegal or inappropriate argument.

    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Something else went wrong.");
            // Throwing a new custom exception as an example
            throw new IllegalArgumentException("A new exception is thrown: " + e.getMessage(), e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
