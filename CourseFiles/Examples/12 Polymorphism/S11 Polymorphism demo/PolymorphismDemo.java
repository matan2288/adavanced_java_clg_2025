import java.util.Scanner;
public class PolymorphismDemo {
  public static void main (String[] args) {
    Date d = null;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number >0 for a Date, <=0 for a DateTime: ");
    if (scan.nextInt() > 0) {
      d = new Date();
    }
    else {
      d = new DateTime();
    }
    System.out.println("The date is " + d);
  }
}