public class DateDemo {
  public static void main (String[] args) {
    Date when = new Date();
    when.setDate(20,7,1969);
    System.out.print("The date " + when.getDay() + "/" +
                     when.getMonth() + "/" + when.getYear());
    if (when.valid()) {
      System.out.println(" is valid");
    }
    else {
      System.out.println(" is invalid");
    }
    when.setDate(32,0,10000);
    System.out.print("The date " + when.getDay() + "/" +
                     when.getMonth() + "/" + when.getYear());
    if (when.valid()) {
      System.out.println(" is valid");
    }
    else {
      System.out.println(" is invalid");
    }
  }
}
