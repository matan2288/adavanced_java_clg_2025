import java.util.Scanner;
public class PrintSquare {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the square: ");
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
} 