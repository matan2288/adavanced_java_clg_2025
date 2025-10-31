import java.util.Scanner;
public class HollowSquare {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the square: ");
    int n = scan.nextInt();
    repeatPrint(n, "* ");
    System.out.println();
    for (int i = 0; i < n - 2; i++) {
      System.out.print("* ");
      repeatPrint(n-2, "  ");
      System.out.println("*");
    }
    repeatPrint(n, "* ");
    System.out.println();
  }
  static void repeatPrint (int times, String value) {
    for (int i = 0; i < times; i++) {
      System.out.print(value);
    }
  }
}
