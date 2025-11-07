import java.util.Scanner;

public class Drill8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) { // Row
            for (int j = 0; j < i; j++) { // Charecter in a row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
