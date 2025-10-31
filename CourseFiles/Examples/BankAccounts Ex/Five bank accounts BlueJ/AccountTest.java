import java.util.Scanner;
public class AccountTest {
  public static void main (String[] args) {
    BankAccount     a = new BankAccount("Alice");
    CurrentAccount  b = new CurrentAccount("Bob");
    LimitedAccount  c = new LimitedAccount("Carol");
    ChargingAccount  d = new ChargingAccount("Noam");
    RestrictedAccount  e = new RestrictedAccount("Gal");
    System.out.println("a is an ordinary (superclass) bank account, b is a current account."); 
    System.out.println("c is a limited account, d is a ChargingAccount.");
     System.out.println("e is a RestrictedAccount. All five starting with a zero balance");
    System.out.println();

    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("Enter amount to withdraw (0 to exit): ");
      int amt = scan.nextInt();
      if (amt == 0) {
        return;
      } 
      System.out.println("a: " + a.withdraw(amt) + " -> " + a.getBalance());
      System.out.println("b: " + b.withdraw(amt) + " -> " + b.getBalance());
      System.out.println("c: " + c.withdraw(amt) + " -> " + c.getBalance());
      System.out.println("d: " + d.withdraw(amt) + " -> " + d.getBalance());
      System.out.println("e: " + e.withdraw(amt) + " -> " + e.getBalance());
    }
  }
}
