public class Date {
  private int day;
  private int month;
  private int year;
  private boolean valid (int d, int m, int y) {
    if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1901 || y > 2099) {
      return false;
    }
    return true;
  }
  public Date() {
      setDate(1,1,1901);
  }
  public Date(int day, int month, int year) {
      setDate(day,month,year);     
      
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
}
