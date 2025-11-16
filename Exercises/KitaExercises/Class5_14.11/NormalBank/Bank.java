import java.util.Scanner;


public class Bank {
    private int accountNumber;
    private String accountName;
    private float balance;
    Scanner scan = new Scanner(System.in);

    // setAccount
    public void setAccount(int newAccountNumber, String newAccountName, int initialDeposit) {
        if (initialDeposit <= 0) {
            int validSecondDeposit = scan.nextInt();
            while (validSecondDeposit <= 0) {
                System.out.println("Please add deposit more then 0!: ");
                validSecondDeposit = scan.nextInt();
            }
        }

        this.accountNumber = newAccountNumber;
        this.accountName = newAccountName;
        this.balance = initialDeposit;

        System.out.println("Account name: " + accountName + " has been set up succesfully!");
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountName() {
        return this.accountName;
    }

    private float getBalance() {
        return this.balance;

    }

    public void getAccount(int accountNumber) {
        System.out.println("Account Name:" + getAccountName() + " Account Number:" + getAccountNumber()
                + " Account Balance: " + getBalance());
    }

    // deposit
    public void deposit(float depositAmount) {
        if (depositAmount <= 0) {
            float validSecondDeposit = scan.nextFloat();
            while (validSecondDeposit <= 0) {
                System.out.println("Please add deposit more then 0!: ");
                validSecondDeposit = scan.nextFloat();
                balance += validSecondDeposit;
            }
        }

        balance += depositAmount;
        System.out.println("You have added: $" + depositAmount + " to your account!");
    }

    // withdraw
    public void withdraw(float withdrawAmount) {
        if (withdrawAmount > getBalance()) {
            System.out.println("Please only withdraw no more then your balance!: ");
            float secondValidWithdrawAmount = scan.nextFloat();
            while (secondValidWithdrawAmount > getBalance()) {
                secondValidWithdrawAmount = scan.nextFloat();
                System.out.println("Please only withdraw no more then your balance!: ");
            }

            this.balance -= secondValidWithdrawAmount;
            System.out.println("You have withdrawed: $" + withdrawAmount + " from your account!");
            return;
        }
        
        this.balance -= withdrawAmount;
        System.out.println("You have withdrawed: $" + withdrawAmount + " from your account!");
    }
}
