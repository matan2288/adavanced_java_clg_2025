import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i > -input.length(); i--) {
            output.append(input.charAt(input.length() - 1));
        }

        System.out.println(output);
        scan.close();

    }

}
