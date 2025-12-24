
public class Time {
    private int seconds;

    // ? Question 1
    public int getValidatedSecondsRange(int seconds) {
        return (seconds % 86400 + 86400) % 86400;
    }

    // Empty Constructor
    public Time() {

    }

    public Time(int hours, int minutes, int seconds) {
        int convertedSeconds = (seconds % 86400 + 86400) % 86400;
        int convertedMinutesToSeconds = minutes * 60;
        int convertedHoursToSeconds = (hours * 3600);
        int totalSeconds = convertedSeconds + convertedMinutesToSeconds + convertedHoursToSeconds;
        this.seconds = getValidatedSecondsRange(totalSeconds);
    }

    //////////////////////////////////////////////////////////////

    // ? Question 2
    private int reminder;

    public int getHour() {
        int reminderFromHours = seconds % 3600;
        reminder = reminderFromHours;

        int exactHourInSeconds = seconds - reminder;
        int exactHourConvertedFromSeconds = exactHourInSeconds / 3600;

        return exactHourConvertedFromSeconds;
    }

    public int getMinute() {
        int reminderFromMinutes = reminder % 60;
        int excatMinuteInSeconds = reminder - reminderFromMinutes;

        reminder = reminderFromMinutes;

        int exacMinuteConvertedFromSeconds = excatMinuteInSeconds / 60;

        return exacMinuteConvertedFromSeconds;
    }

    public int getSecond() {
        return reminder;
    }

    //////////////////////////////////////////////////////////////

    // ? Question 3
    public void add(int hours, int minutes, int passedSeconds) {
        int hoursInSeconds = (hours * 3600 % 86400 + 86400) % 86400;
        int minutesInSeconds = (minutes * 60 % 86400 + 86400) % 86400;
        int totalInSecondsToAdd = hoursInSeconds + minutesInSeconds + passedSeconds;

        seconds = (seconds + totalInSecondsToAdd) % 86400;
    }

    //////////////////////////////////////////////////////////////

    // ? Question 4
    public double getDays() {
        double secondsInDouble = this.seconds;
        return secondsInDouble / 86400;
    }

    //////////////////////////////////////////////////////////////

    // ? Question 5
    static String validateNum(int num) {
        if (num < 10 || num == 0 || num == 00) {
            return "0" + String.valueOf(num);

        }
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        int h = this.getHour();
        int m = this.getMinute();
        int s = this.getSecond();

        String timeInString = String.valueOf(h) + ":" + this.validateNum(m) + ":" + this.validateNum(s);

        return timeInString;
    }
    //////////////////////////////////////////////////////////////

    // ? Question 6
    static class AccurateTime extends Time {
        private int milliseconds;

        public int getMilliseconds() {
            return milliseconds;
        }

        public void setMilliseconds(int ms) {
            if (ms > 999) {
                double totalSecondsInMiliseconds = (int) ms / 1000;
                int leftoverSeconds = (int) totalSecondsInMiliseconds;
                int leftoverMiliseconds = (int) ((totalSecondsInMiliseconds - leftoverSeconds) * 1000);

                milliseconds = leftoverMiliseconds;

            } else if (ms <= 0) {
                milliseconds = 0;

            } else {
                milliseconds = ms;
            }
        }

        // Constructor with 3 parameter(assumes the number of milliseconds is zero)
        public AccurateTime(int h, int m, int s) {
            super(h, m, s);
            setMilliseconds(0);
            getMilliseconds();
        }

        // Constructor with 4 paramaters(4th parameter is the real milliseconds)
        // public AccurateTime(int h, int m, int s, int ms) {
        // super(h, m, s);
        // setMilliseconds(ms);
        // getMilliseconds();
        // }

        // ? Question 7
        @Override
        public String toString() {
            String convertedMsToString;

            if (getMilliseconds() == 0) {
                convertedMsToString = "000";
            } else {
                convertedMsToString = String.valueOf(getMilliseconds());
            }

            String timeInString = super.toString() + "." + convertedMsToString;

            return timeInString;
        }

        public AccurateTime(int h, int m, int s, int ms) {
            super(h, m, s);
            setMilliseconds(ms);
            getMilliseconds();

        }

        // ? Question 8
        @Override
        public double getDays() {
            return (super.seconds + getMilliseconds() / 1000.0) / 86400.0;
        }

        public static void main(String[] args) {
            AccurateTime t1 = new AccurateTime(10, 30, 0, 0);
            AccurateTime t2 = new AccurateTime(10, 30, 0, 432);

            double n = t2.getDays();
            System.out.println(n);
        }

    }
    //////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Time now = new Time(6, 45, 0);
        System.out.println(now);
        // ? Question 5

        // String s = now.toString();
    }
}
