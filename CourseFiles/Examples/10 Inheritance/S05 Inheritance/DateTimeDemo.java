public class DateTimeDemo {
  public static void main (String[] args) {
    DateTime when = new DateTime(20,7,1969,14,30,00);
    System.out.println("The date and time is " + when.getDay() +
                       "/" + when.getMonth() + "/" + when.getYear() +
                       " " + when.getHour() + ":" + when.getMinute() +
                       ":" + when.getSecond());
    DateTime other = new DateTime(32,0,10000,14,30,00);
    System.out.println("The date and time is " + other.getDay() +
                       "/" + other.getMonth() + "/" + other.getYear() +
                       " " + other.getHour() + ":" + other.getMinute() +
                       ":" + other.getSecond());
    DateTime now = new DateTime();
    System.out.println("The date is and time " + now.getDay() +
                       "/" + now.getMonth() + "/" + now.getYear() +
                       " " + now.getHour() + ":" + now.getMinute() +
                       ":" + now.getSecond());
  }
}
