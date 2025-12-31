package Exercises.Polymorphisem_Constructors.Exec1;

//? בהינתן שלוש המחלקות הבאות, מה יהיה הפלט?
 

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
// _________________________________________
class LimitedAccount extends BankAccount {
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
// _____________________________________________________

class  Test {
public static void main (String args[]) {
     
       BankAccount b = new LimitedAccount("Bob",10000);
       
      
      b.withdraw(7000); //! 5000
       
      System.out.println("Balance = " + b.getBalance());
    }
  }
