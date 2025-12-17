// They want you to implement a Time class that represents the time of 
// day as seconds since midnight (0–86399), ensuring the value always stays within that range.

// midnight 0, next day midnight 86400
public class Time {
    private int finalSeconds; // validate if it is between 0-86399

    public int CalculateSeconds(int seconds, int minutes, int hours) {
        seconds = (seconds % 86400 + 86400) % 86400;
        minutes = minutes * 60; // display in seconds
        hours = hours * 3600; // display in seconds
        System.out.println("Seconds: " + seconds + " seconds");
        System.out.println("Minutes: " + minutes + " seconds");
        System.out.println("Hours: " + hours + " seconds");

        int res = seconds + minutes + hours;
        return seconds + minutes + hours;
    }

    void main() {
        CalculateSeconds(5, 60, 2);
    }
}
// Time now = new Time(0,0,37800); // 37800 seconds past midnight
// Time now = new Time(-14,20,600);