import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scan.nextLine();
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        System.out.println(output);
        scan.close();

    }

}
