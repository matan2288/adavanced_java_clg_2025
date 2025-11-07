
import java.util.Scanner;
import java.util.Random;

public class Drill6 {

    static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();

        while (dice1 != dice2) {
            System.out.println(+dice1 + " and " + dice2 + " are NOT equal!");
            dice1 = rollDice();
            dice2 = rollDice();
        }
        System.out.println("You rolled " + dice1 + " and " + dice2);
    }
}
