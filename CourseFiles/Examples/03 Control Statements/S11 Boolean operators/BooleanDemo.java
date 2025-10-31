public class BooleanDemo {
  public static void main (String[] args) {
    boolean a, b, c;
    a = 5 > 3;
    b = 5 != 3;
    c = 5 < 3;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    a = b || c;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    b = a && c;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    c = !b;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    a = (5 > 3 && 5 < 3) || c;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
  }
}
