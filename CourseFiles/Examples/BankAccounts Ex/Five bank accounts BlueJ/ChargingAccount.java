   public class ChargingAccount extends BankAccount 
  {
      public ChargingAccount (String name)
     {
        super(name);
      }
      public ChargingAccount (String name, long balance) 
      {
        super(name,balance);
      }
         @Override
         public long withdraw (long amount) 
         {
            long charge = amount * 2 /100;   // or round off the charge somehow
            if (charge < 5) 
            {
              charge = 5;
            }
           return super.withdraw(amount+charge);
        }
     }
