import java.util.Scanner;
public class IfElseDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a month number: ");
    int month = scan.nextInt();
    if (month >= 1 && month <= 12) {
      System.out.println("The month number is valid");
    }
    else {
      System.out.println("Invalid month number");
    }
  }
}
