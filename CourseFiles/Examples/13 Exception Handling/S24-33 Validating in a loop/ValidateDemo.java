import java.util.Scanner;
import java.util.InputMismatchException;
public class ValidateDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    while (true) {
      try {
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        break;
      }
      catch (InputMismatchException e) {
        scan.nextLine();
        System.out.println("Please enter a number!");
      }
    }
    System.out.println("You entered " + n);
  }
}
