import java.util.Scanner;
public class BreakDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int total = 0;
    while (true) {
      System.out.print("Enter a number: ");
      int number = scan.nextInt();
      if (number < 0) {
        break;
      }
      total += number;
    }
  }
}