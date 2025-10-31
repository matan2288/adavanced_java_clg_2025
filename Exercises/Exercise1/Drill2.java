package Exercises.Exercise1;
import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        int time = (hours*60)*60 + minutes*60 + seconds;

        System.out.println("Your total time in seconds is " + time);
        scan.close();
    }
}
