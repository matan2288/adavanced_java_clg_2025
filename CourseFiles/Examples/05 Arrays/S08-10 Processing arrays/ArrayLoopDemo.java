public class ArrayLoopDemo {
  public static void main (String[] args) {
    int[] ia = { 1, 2, 3, 5, 7, 11, 13, 17 };
    for (int i = 0; i < ia.length; i++) {
      System.out.println("Element " + i + " = " + ia[i]);
    }
    String[] sa = { "this", "that", "the other" };
    for (String s : sa) {
      System.out.println(s);
    }
  }
}