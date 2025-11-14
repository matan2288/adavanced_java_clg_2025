package Exercises.Qualigrade.Exercise2;

import java.util.Scanner;

public class Drill1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String chars = scan.nextLine();
        int vowels = 0;

        chars = chars.toLowerCase();

        for (int i = 0; i < chars.length(); i++) {
            switch (chars.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
            }
        }

        System.out.println("The number of found chars is: " + vowels);
        scan.close();

    }
}
