import java.util.Scanner;
class Greetings {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Is it morning (m) or afternoon (a)? ");
    String reply = scan.nextLine().toLowerCase();
    switch (reply) {
      case "m":
      case "morning":
        System.out.println("Good Morning!");
        break;
      case "a":
      case "afternoon":
        System.out.println("Good Afternoon!");
        break;
      default:
        System.out.println("Please type 'm' or 'a'!");
        break;
    }
  }
}