import java.util.Scanner;
class Greetings {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Is it morning (m) or afternoon (a)? ");
    String reply = scan.nextLine();
    if (reply.charAt(0) =='m') {   // morning
      System.out.println("Good morning!");
    }
    else {                          // afternoon?
      System.out.println("Good afternoon!");
    }
  }
}
