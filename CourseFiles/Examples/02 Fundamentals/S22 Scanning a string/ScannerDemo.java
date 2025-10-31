import java.util.Scanner;
public class ScannerDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner("123  456");
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
}
