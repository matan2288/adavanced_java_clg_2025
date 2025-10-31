class Date {
  int day;
  int month;
  int year;
  boolean valid () {      // a very incomplete implementation!
    if (month < 1 || month > 12 ||
        day < 1 || day > 31 ||
        year < 1901 || year > 2099) {
      return false;
    }
    return true;
  }
}