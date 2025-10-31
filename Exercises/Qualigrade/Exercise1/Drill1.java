import java.util.Scanner;
public class Drill1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.nextLine().charAt(0);
        boolean isHexLetter = (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9');
        if (isHexLetter) {
            System.out.println("Hex");
        }
        scan.close();
    }
}
