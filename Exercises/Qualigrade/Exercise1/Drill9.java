import java.util.Scanner;

public class Drill9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your numbers (negative to end): ");
        int user_number = scan.nextInt();
        int max_num = user_number;

        while (user_number >= 0) {
            if (user_number > max_num) {
                max_num = user_number;
            }
            System.out.print("Enter next number: ");
            user_number = scan.nextInt();
        }
        
        System.out.println("Your max number is: ");
        System.out.println(max_num);
        scan.close();
    }
}
