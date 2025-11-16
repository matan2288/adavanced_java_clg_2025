public class BankdemoTwo {
    public static void main(String[] args) {
        BankWithConsturctor myAccount = new BankWithConsturctor(123, "John Doe", 5000);
        myAccount.displayAccount();
    }
}