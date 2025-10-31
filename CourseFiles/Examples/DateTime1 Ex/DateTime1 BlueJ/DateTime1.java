public class DateTime1 extends Date1 {
  private int hour, minute, second;
  public DateTime1() {
    super();
  }
  public DateTime1(int day, int month, int year,
                  int hour, int minute, int second) {
    super(day,month,year);
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
  @Override
  public String toString() {
    return super.toString() + " " + hour + ":" + minute + ":" + second;
  }
}
