package Exercises.GuessingGame;
// Number between 0-1000

import java.util.Random;
import java.util.Scanner;

// User has 10 guesses
// Success Message
// Failure message after 10 tries
// For each single faliure the user will get a "lower" or "higher" message for the game

public class GuessingGame {
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
    int systemNumberPick = r.nextInt(1000) + 1;
    int numberOfTries = 1;

    public void initiateGame() {
        System.out.println("Welcome to the Guessing Game! Please pick a number between 0 to 1000 to start!:");
        int userInput = scan.nextInt();

        while (userInput < 0 || userInput > 1000) {
            System.out.println("Please pick a number between 0-1000 ONLY!:");
            userInput = scan.nextInt();
        }

        System.out.println(systemNumberPick);
        System.out.println(userInput);

        for (int i = 0; i < 10; i++) {

            if (userInput < systemNumberPick) {
                System.out.println("Please pick a HIGHER number!");
                numberOfTries += numberOfTries + 1;
                userInput = scan.nextInt();
                continue;
            }
            if (userInput > systemNumberPick) {
                System.out.println("Please pick a LOWER number!");
                numberOfTries += numberOfTries + 1;
                userInput = scan.nextInt();
                continue;
            }

            if (numberOfTries == 10) {
                System.out.println("You lost the game! The correct number was: " + this.systemNumberPick);
                numberOfTries += numberOfTries + 1;
                break;
            }

            if (userInput == systemNumberPick) {
                System.out.println("You are correct! Your number is: " + this.systemNumberPick + " You won the game!");
                break;
            }
        }

    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.initiateGame();
    }
}
