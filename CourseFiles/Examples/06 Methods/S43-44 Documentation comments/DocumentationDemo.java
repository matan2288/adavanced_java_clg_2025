import java.util.Scanner;
public class DocumentationDemo {
  public static void main (String[] args) {
    System.out.println("In BlueJ, open the source editor for DocumentationDemo");
    System.out.println("then select \"Documentation\" instead of \"Source Code\"");
    System.out.println("from the menu at the top right.");
    System.out.println();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the square: ");
    int n = scan.nextInt();
    System.out.println( repeatString(n,"* ") );
    for (int i = 0; i < n - 2; i++) {
      System.out.println( "* " + repeatString(n-2,"  ") + "*");
    }
    System.out.println( repeatString(n,"* ") );
  }
  /**
   *  Generate a repeated copy of a string.
   *
   *  @param times
   *    the number of times to repeat the string.
   *  @param value
   *    the string value to be repeated.
   *  @return
   *    The string value repeated the specified number
   *    of times.
   */
  public static String repeatString (int times, String value) {
    String s = "";
    for (int i = 0; i < times; i++) {
      s += value;
    }
    return s;
  }
}
