import java.util.Scanner;

class Date {
    int day;
    int month;
    int year;
    Scanner scan = new Scanner(System.in);

    Date(int passedDay, int passedMonth, int passedYear) {
        while (!valid(passedDay, passedMonth, passedYear)) {
            System.out.println("Please submit a valid day! (1-31)");
            this.day = scan.nextInt();
            System.out.println("Please submit a valid month! (1-12)");
            this.month = scan.nextInt();
            System.out.println("Please submit a valid year! (1901-2099)");
            this.year = scan.nextInt();
            return;
        }

        this.day = passedDay;
        this.month = passedMonth;
        this.year = passedYear;
    }

    boolean valid(int passedDay, int passedMonth, int passedYear) {
        if (passedMonth < 1 || passedMonth > 12 || passedDay < 1 || passedDay > 31 || passedYear < 1901 || passedYear > 2099) {
            return false;
        }
        return true;
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date newValidDate = new Date(1, 1, 1994);
        newValidDate.displayDate();
        Date newDateInvalidDate = new Date(50, 1, 1994);
        newDateInvalidDate.displayDate();
    }
}
