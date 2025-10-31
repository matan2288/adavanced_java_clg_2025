public class DateDemo {
  public static void main (String[] args) {
    Date when = new Date(20,7,1969);
    System.out.println("The date is " + when.getDay() + "/" +
                       when.getMonth() + "/" + when.getYear());
    Date other = new Date(32,0,10000);
    System.out.println("The date is " + other.getDay() + "/" +
                       other.getMonth() + "/" + other.getYear());
    Date now = new Date();
    System.out.println("The date is " + now.getDay() + "/" +
                       now.getMonth() + "/" + now.getYear());
  }
}
