import java.util.Scanner;
public class AccountTest {
  public static void main (String[] args) {
    BankAccount     a = new BankAccount("Alice");
    CurrentAccount  b = new CurrentAccount("Bob");
    System.out.println("a is an ordinary (superclass) bank account, and b is a current account."); 
    System.out.println("Both starting with a zero balance");
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
    }
  }
}
