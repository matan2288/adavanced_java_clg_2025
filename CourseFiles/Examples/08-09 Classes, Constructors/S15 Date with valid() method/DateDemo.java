public class DateDemo {
  public static void main (String[] args) {
    Date when = new Date();
    when.day   = 20; 
    when.month = 7;
    when.year  = 1969;
    System.out.print("The date " + when.day + "/" +
                     when.month + "/" + when.year);
    if (when.valid()) {
      System.out.println(" is valid");
    }
    else {
      System.out.println(" is invalid");
    }
    when.day   = 32; 
    when.month = 0;
    when.year  = 10000;
    System.out.print("The date " + when.day + "/" +
                     when.month + "/" + when.year);
    if (when.valid()) {
      System.out.println(" is valid");
    }
    else {
      System.out.println(" is invalid");
    }
  }
}
