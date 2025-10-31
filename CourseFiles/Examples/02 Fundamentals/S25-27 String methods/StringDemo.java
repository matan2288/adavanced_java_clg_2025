public class StringDemo {
  public static void main (String[] args) {
    String s = "Good Morning";
    System.out.println("s == " + s);
    System.out.println("s.length() == " + s.length());
    System.out.println("s.toLowerCase() == " + s.toLowerCase());
    System.out.println("s.toUpperCase() == " + s.toUpperCase());
    System.out.println("s.indexOf(\"G\") == " + s.indexOf("G"));
    System.out.println("s.indexOf(\"oo\") == " + s.indexOf("oo"));
    System.out.println("s.indexOf(\"g\") == " + s.indexOf("g"));
    System.out.println("s.indexOf(\"x\") == " + s.indexOf("x"));
    System.out.println("s.startsWith(\"G\") == " + s.startsWith("G"));
    System.out.println("s.endsWith(\"G\") == " + s.endsWith("G"));
    System.out.println("s.toUpperCase().endsWith(\"G\") == " + s.toUpperCase().endsWith("G"));
    System.out.println("s.substring(5,9) == " + s.substring(5,9));
    System.out.println("s.substring(5) == " + s.substring(5));
    System.out.println("s.replace(\"o\",\"x\") == " + s.replace("o","x"));
    System.out.println("s.replace(\"oo\",\"ran\") == " + s.replace("oo","ran"));
    System.out.println("s.contains(\"or\") == " + s.contains("or"));
    System.out.println("s.contains(\"on\") == " + s.contains("on"));
    
  }
}
