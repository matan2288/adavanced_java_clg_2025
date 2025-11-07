import java.util.Scanner;

public class Arrays_Drill {
    public static void main(String[] args) {
        System.out.println("Insert your array size");

        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] myNumbers = new int[arrSize];
        int max = myNumbers[0];

        for (int i = 0; i < arrSize; i++) {
            System.out.println("Insert your number");
            myNumbers[i] = scan.nextInt();
            if (myNumbers[i] > max) {
                max = myNumbers[i];
            }
        }

        System.out.println(max);
    }
}
