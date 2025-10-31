public class Date {
  private int day;
  private int month;
  private int year;
  public boolean valid () {      // a very incomplete implementation!
    if (month < 1 || month > 12 ||
        day < 1 || day > 31 ||
        year < 1901 || year > 2099) {
      return false;
    }
    return true;
  }
  public void setDate (int d, int m, int y) {
    day   = d;
    month = m;
    year  = y;
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
}
