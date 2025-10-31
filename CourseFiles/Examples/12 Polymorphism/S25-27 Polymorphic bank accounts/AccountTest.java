import java.util.Scanner;
public class AccountTest {
public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);
    BankAccount acct = null;
    System.out.print("Account holder's name? ");
    String name = scan.nextLine();
    System.out.print("(B)asic, (C)urrent or (L)imited account? ");
    String type = scan.nextLine();
    switch (type.toUpperCase()) {
      case "B":
        acct = new BankAccount(name);
        break;
      case "C":
        acct = new CurrentAccount(name);
        break;
      case "L":
        acct = new LimitedAccount(name);
        break;
    }
    while (true) {
      System.out.print("Enter amount (0 to exit): ");
      int amt=scan.nextInt();
      if (amt == 0) {
        return;
      }
      long result = acct.withdraw(amt);
      System.out.println("You withdrew " + result);
      System.out.println("Balance = " + acct.getBalance());
    }
  }
}
