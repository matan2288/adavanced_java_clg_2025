public class ReturnDemo {
  public static void main (String[] args) {
    int[] a = { 2, 3, 5, 7, -1, 13, 17, 19 };
    System.out.println("The array is:");
    for (int i : a) {
      System.out.println(i);
    }
    System.out.println("The array up to the first negative value is:");
    writeArray(a);
  }
  static void writeArray (int[] array) {
    for (int n : array) {
      if (n < 0) {
        return;         // exit as soon as a negative value is found
      }
      System.out.println(n);
    }
  }
}
