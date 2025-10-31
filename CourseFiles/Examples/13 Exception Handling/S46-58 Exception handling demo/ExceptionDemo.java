import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo {
  public static void main (String[] args) {
    System.out.println("This is a variation on the example in the lecture.");
    System.out.println("Type in something which is not an integer to get");
    System.out.println("an InputMismatchException, or type in 1 to get an");
    System.out.println("ArithmeticException, or anything else to display");
    System.out.println("the value of n/(n-1).");
    try {
      mightFail();
    }
    catch (Exception e) {
      System.out.println("The following exception was caught: " + e.getClass());
      System.out.println("The exception message was: " + e.getMessage());
    }
  }
  static int mightFail () {
    try {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      if (n > 0) {
        n = n / (n-1);
      }
      return n;
    }
    catch (InputMismatchException e) {
      System.out.println("The following InputMismatchException was caught:");
      e.printStackTrace();
    }
    return 0;
  }
}
