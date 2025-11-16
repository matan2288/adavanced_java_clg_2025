
public class Bankdemo {
    public static void main(String[] args) {
        Bank newBankAccount = new Bank();
        newBankAccount.setAccount(123, "John Doe", 5000);
        newBankAccount.getAccount(123);
        newBankAccount.withdraw(6000);
        newBankAccount.getAccount(123);
        // newBankAccount.deposit(6000);
    }

}