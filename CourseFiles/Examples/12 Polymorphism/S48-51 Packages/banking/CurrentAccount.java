package banking;

public class CurrentAccount extends BankAccount {
  private long overdraftLimit = 5000;
  public CurrentAccount (String name) {
    super(name);
  }
  public CurrentAccount (String name, long balance) {
    super(name,balance);
  }
  @Override
  public long withdraw (long amount) {
    if (getBalance() - amount < -5000) {
      amount = 0;
    }
    return super.withdraw(amount);
  }
}
