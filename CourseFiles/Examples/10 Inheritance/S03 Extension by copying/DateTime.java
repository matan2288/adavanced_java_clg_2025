public class DateTime {
  //
  //  Copy everything from class Date...
  //
  private int day, month, year;
  private boolean valid (int d, int m, int y) {
    if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1901 || y > 2099) {
      return false;
    }
    return true;
  }
  public int getDay() {
    return day;
  }
  public int getMonth() {
    return month;
  }
  public int getYear() {
    return year;
  }
  public void setDate (int day, int month, int year) {
    if ( valid(day,month,year) ) {
      this.day   = day;
      this.month = month;
      this.year  = year;
    }
  }
  //
  // Now add the extra things we need to represent a time:
  //
  private int hour, minute, second;
  public DateTime() {
    this(1,1,1901,0,0,0);
  }
  public DateTime(int day, int month, int year,
                  int hour, int minute, int second) {
    setDate(day,month,year);
    setTime(hour,minute,second);
  }
  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }
  public int getSecond() {
    return second;
  }
  public void setTime (int hour, int minute, int second) {
    this.hour   = hour;
    this.minute = minute;
    this.second = second;
  }
}
