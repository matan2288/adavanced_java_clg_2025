public class AssignmentDemo {
  public static void main (String[] args) {
    int a, b, c;
    a = 5;          // set a to 5
    b = a + 3;      // set b to 5 + 3 = 8
    c = a * b + 1;  // set c to 5 x 8 + 1 = 41
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    c = b + 2 * a;  // set c to 8 + 2 x 5 = 18
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    a = a + 1;      // set a to 5 + 1 = 6
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    a = a + 1;      // set a to 6 + 1 = 7
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    b = b * 2;      // set b to 8 x 2 = 16
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
  }
}
