public class DateTimeDemo {
  public static void main (String[] args) {
    Date when = new Date(20,7,1969);
    DateTime other = new DateTime(20,7,1969,14,30,00);
    System.out.println("The date is " + when.toString());
    System.out.println("The date and time is " + other.toString());
    //
    //  toString() is used automatically when an object
    //  needs to be converted to a string:
    //
    System.out.println("The date is " + when);
    System.out.println("The date and time is " + other);
  }
}
