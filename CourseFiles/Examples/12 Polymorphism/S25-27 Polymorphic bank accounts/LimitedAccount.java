public class LimitedAccount extends BankAccount {
  public LimitedAccount (String name) {
    super(name);
  }
  public LimitedAccount (String name, long balance) {
    super(name,balance);
  }
  @Override
  public long withdraw (long amount) {
    if (amount > 5000) {
      amount = 5000;
    }
    return super.withdraw(amount);
  }
}
