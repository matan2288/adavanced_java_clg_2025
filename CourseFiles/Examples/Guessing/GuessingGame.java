import java.util.Scanner;
import java.util.Random;
class GuessingGame 
{
  public static void main (String[] args) 
  {
    Random r = new Random();
    int secret = r.nextInt(1000) + 1;
    int guess = 0;
    System.out.println("I'm thinking of a number between 1 and 1000.");
    System.out.println("You have 10 chances to guess the number!");
    Scanner scan = new Scanner(System.in);
    for (int i = 1; i <= 10 && guess != secret; i++) {
      System.out.print("Enter guess no. " + i + ": ");
      guess = scan.nextInt();
      if (guess > secret) {
        System.out.println("Too high -- try a lower number!");
      }
      else if (guess < secret) {
        System.out.println("Too low -- try a higher number!");
      }
    }
    if (guess == secret) {
      System.out.println("Correct, you win!");
    }
    else {
      System.out.println("Sorry, you failed -- the number was " + secret);
    }
     
  }
}