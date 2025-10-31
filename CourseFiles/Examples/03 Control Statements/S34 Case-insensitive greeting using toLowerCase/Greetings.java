import java.util.Scanner;
class Greetings {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Is it morning (m) or afternoon (a)? ");
    String reply = scan.nextLine().toLowerCase();
    if (reply.charAt(0) == 'm') {
      System.out.println("Good morning!");
    }
    else if (reply.charAt(0) == 'a') {
      System.out.println("Good afternoon!");
    }
    else {
      System.out.println("Please type 'm' or 'a'!");
    }
  }
}