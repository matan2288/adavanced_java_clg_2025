package Exercises.Qualigrade.Exercise1;

import java.util.Scanner;

public class Drill5 {
    public static void main() {
        System.out.println("Type the number of the month of your choosing:");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
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
        System.out.println("Your number of days in month " + month + " are " + length + " days.");
        scan.close();
    }

}
