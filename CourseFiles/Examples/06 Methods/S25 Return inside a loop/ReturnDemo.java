import java.util.Scanner;
public class ReturnDemo {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Test if a number is in an array of primes < 20");
    System.out.println("Enter a number: ");
    int n = scan.nextInt();
    int[] a = { 2, 3, 5, 7, 11, 13, 17, 19 };
    boolean b = contains(a,n);
    if (b) {
      System.out.println("The value " + n + " is in the array");
    }
    else {
      System.out.println("The value " + n + " is not in the array");
    }
  }
  static boolean contains (int[] array, int value) {
    for (int a : array) {
      if (a == value) {
        return true;
      }
    }
    return false;
  }
}