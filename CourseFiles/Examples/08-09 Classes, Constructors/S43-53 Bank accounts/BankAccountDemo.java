public class BankAccountDemo {
  public static void main (String[] args) {
    BankAccount a = new BankAccount("Alice");
    BankAccount b = new BankAccount("Bob",1000);
    displayAccount(a);
    displayAccount(b);
    System.out.println("Deposit 800 to Alice, -100 to Bob:");
    a.deposit(800);
    b.deposit(-100);
    displayAccount(a);
    displayAccount(b);
    System.out.println("Withdraw -50 from Alice, 500 from Bob:");
    a.withdraw(-50);
    b.withdraw(500);
    displayAccount(a);
    displayAccount(b);    
  }
  static void displayAccount(BankAccount ac) {
    System.out.println(ac.getName() + " (account number " +
                       ac.getAccountNumber() + "): " + ac.getBalance());
  }
}
