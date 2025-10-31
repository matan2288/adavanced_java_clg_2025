public class BankAccount {
  private int number;
  private String name;
  private long balance;
  private static int nextNumber = 10000000;

  public BankAccount (String name) {
    this(name,0);
  }
  public BankAccount (String name, long balance) {
    this.name = name;
    this.balance = balance;
    this.number = nextNumber++;
  }

  public int getAccountNumber() {
    return number;
  }
  public String getName() {
    return name;
  }
  public long getBalance() {
    return balance;
  }
  public long deposit (long amount) {
    if (amount < 0) {
      amount = 0;
    }
    balance += amount;
    return amount;
  }
  public long withdraw (long amount) {
    if (amount < 0) {
      amount = 0;
    }
    balance -= amount;
    return amount;
  }
}
