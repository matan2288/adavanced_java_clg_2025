import java.util.Scanner;

public class Drill3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int maximum;
        if(first > second) {
            maximum = first;
        } else {
            maximum = second;
        }
        System.out.println(maximum);
        scan.close();
    }
}
