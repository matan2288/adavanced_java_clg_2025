import java.util.Scanner;

public class Drill10 {

    static int daysInMonth(int month) {
        int length = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                length = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                length = 30;
                break;

            case 2:
                length = 28;
                break;
        }

        return length;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date as three integers: ");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        boolean valid;

        int length = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                length = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                length = 30;
                break;

            case 2:
                if (year % 4 == 0)
                    length = 29;
                else
                    length = 28;
                break;
        }

        boolean validMonth = month >= 1 && month <= 12;
        boolean validDay = validMonth && (length >= day && 1 <= day);
        boolean validYear = year >= 1901 && year <= 2099;

        valid = validDay && validMonth && validYear;
        System.out.print(valid);
    }
}
