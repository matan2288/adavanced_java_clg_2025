import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {
  public static void main (String[] args) {
    int num1 = readSafely("Enter the first number: ",
                          "Please enter a number!");
    int num2 = readSafely("Enter the second number: ",
                          "Please enter a number!");
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
  }
  static int readSafely (String prompt, String error) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        return scan.nextInt();
      }
      catch (InputMismatchException e) {
          scan.nextLine();
        System.out.println(error);
      }
    }
  }
}