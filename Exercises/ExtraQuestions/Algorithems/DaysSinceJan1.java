package Exercises.ExtraQuestions.Algorithems;

// כתבו שיטה המקבלת שלושה פרמטרים(day,month,year)ומחשבת את מספר הימים מאז ה-1 בינואר של אותה שנה.הערך המוחזר צריך להיות מספר בין 1 ל-365(או 366 בשנה מעוברת),כאשר 1 מייצג את ה-1 בינואר ו-365(או 366)מייצג את ה-31 בדצמבר.

public class DaysSinceJan1 {

    public int calculateDays(int d, int m, int y) {
        int result = d;
        boolean isLeapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < m - 1; i++) {
            result += daysInMonths[i];
        }

        if (isLeapYear && m > 2) {
            result += 1;
        }

        return result;
    }

    public static void main() {
        DaysSinceJan1 obj = new DaysSinceJan1();
        System.out.println(obj.calculateDays(1, 3, 2025));
    }
}
