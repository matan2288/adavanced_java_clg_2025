public class ForDemo {
  public static void main (String[] args) {
    for (int n = 10; n > 0; n = n - 1) {
      System.out.print(n + " ");
    }
    System.out.println("----");
    for (int n = 0; n < 10; n = n + 1) {
      System.out.print(n + " ");
    }
    System.out.println("----");
    for (int n = 2; n <= 20; n = n + 2) {
      System.out.print(n + " ");
    }
    System.out.println("----");
    for (int n = 1; n < 100; n = n * 2) {
      System.out.print(n + " ");
    }
  }
}
