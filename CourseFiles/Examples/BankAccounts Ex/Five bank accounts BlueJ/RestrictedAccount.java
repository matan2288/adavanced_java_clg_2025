    public class RestrictedAccount extends BankAccount {
      private int withdrawalCount = 0;

      public RestrictedAccount (String name) {
        super(name);
      }
      public RestrictedAccount (String name, long balance) {
        super(name,balance);
      }

      @Override
      public long withdraw (long amount) {
        withdrawalCount++;
        if (withdrawalCount > 3) {
          amount = 0;
        }
        return super.withdraw(amount);
      }

      @Override
      public long deposit (long amount) {
        withdrawalCount = 0;
        return super.deposit(amount);
      }
    }
