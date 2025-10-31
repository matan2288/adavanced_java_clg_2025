public class DateDemo {
  public static void main (String[] args) {
    System.out.println("In BlueJ, open the source editor for Date");
    System.out.println("then select \"Documentation\" instead of \"Source Code\"");
    System.out.println("from the menu at the top right.");
    System.out.println();

    Date when = new Date();
    when.day   = 20; 
    when.month = 7;
    when.year  = 1969;
    if (when.day == 20 && when.month == 7
                       && when.year == 1969) {
      System.out.println("The eagle has landed!");
    }
  }
}
