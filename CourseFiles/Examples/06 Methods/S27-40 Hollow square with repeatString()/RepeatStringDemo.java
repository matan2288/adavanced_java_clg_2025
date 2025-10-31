import java.util.Scanner;
public class RepeatStringDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the square: ");
    int n = scan.nextInt();
    System.out.println( repeatString(n,"* ") );
    for (int i = 0; i < n - 2; i++) {
      System.out.println( "* " + repeatString(n-2,"  ") + "*");
    }
    System.out.println( repeatString(n,"* ") );
  }
  static String repeatString (int times, String value) {
    String s = "";
    for (int i = 0; i < times; i++) {
      s += value;
    }
    return s;
  }
}
