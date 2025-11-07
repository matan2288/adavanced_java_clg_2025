import java.util.Scanner;

public class Drill7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount: ");

        double amount = scan.nextDouble();
        System.out.print("Enter interest rate: ");

        int rate = scan.nextInt();
        System.out.print("Enter no. of years: ");

        int years = scan.nextInt();

        for (int i = 0; i < years; i++) {
            double intrest_profit_per_year = amount / (rate / 100.0);
            amount = amount + intrest_profit_per_year;
        }
        System.out.println("The amount after " + years + " years at " +
                rate + "% is " + amount);
        scan.close();
    }
}
