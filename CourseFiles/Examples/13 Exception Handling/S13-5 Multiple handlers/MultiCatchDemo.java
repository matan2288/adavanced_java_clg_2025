import java.util.Scanner;
import java.util.InputMismatchException;
public class MultiCatchDemo {
  public static void main (String[] args) {
    int array[] = { 10,20,30,40 };
    Scanner scan = new Scanner(System.in);
    try {
      System.out.print("Enter a number (0 to 3 will be valid): ");
      int num1 = scan.nextInt();
      System.out.println( array[num1] );
    }
    catch (InputMismatchException e) {
      System.out.println("Please enter a number!");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("No such array element!");
    }
  }
}