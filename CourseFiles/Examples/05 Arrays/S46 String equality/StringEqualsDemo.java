public class StringEqualsDemo {
  public static void main (String[] args) {
    String s1 = "Hello";
    //
    //  The following line creates another string with the same value.
    //  We can't just right "Hello" again or the compiler will
    //  recognise that it's the same as before and use the same
    //  string again -- we want a different string with the same value!
    //
    String s2 = (char)(72) + "ell" + s1.substring(4);
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1.equals(s2): " + s1.equals(s2));
    
  }
}