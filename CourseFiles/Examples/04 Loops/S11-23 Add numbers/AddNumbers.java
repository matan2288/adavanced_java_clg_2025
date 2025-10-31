import java.util.Scanner;
public class AddNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a sequence of numbers (-1 to end): ");
    int total = 0;
    int number = scan.nextInt();
    while (number >= 0) {
      total = total + number;
      number = scan.nextInt();
    }
    System.out.println("The total is " + total);
  }
}
