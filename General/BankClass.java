import java.util.Scanner;

public class BankClass {
    // Set variables
    private int number;
    private String name;
    private int balance;
    public int withdrawCounter = 0;
    public String accountCurrency;

    Scanner scan = new Scanner(System.in);


    // ? Encapsulation, Get, Set and manipulate PRIVATE data
    public void setAccount(int number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.number;
    }

    public String getAccountName() {
        return this.name;
    }

    public int getAccountBalance() {
        return this.balance;
    }
    // ? ******************************************* //




    //? Methods
    public void viewAccountDetails() {
        System.out.println("Choose 1-number, 2-name 3-balance 4-all");
        int userInput = scan.nextInt();

        while (userInput > 4 || userInput < 1) {
            System.out.println("Please choose again: 1-number, 2-name 3-balance 4-all");
            userInput = scan.nextInt();
        }
        switch (userInput) {
            case 1:
                System.out.println("Account Number: " + this.number);
                break;
            case 2:
                System.out.println("Account Name: " + this.name);
                break;
            case 3:
                System.out.println("Account Balance: " + this.balance);
                break;
            case 4:
                System.out.println("Account Number: " + this.number + ", Account Name: " + this.name
                        + ", Account Balance: " + this.balance);
                break;
        }
    }

    public void deposit() {
        if (this.withdrawCounter == 4) {
            this.withdrawCounter = 0;
        }

        System.out.println("Please enter an amount you would like to deposit");
        int depositAmount = scan.nextInt();

        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("Deposited: " + depositAmount + " Successfully");
        } else {
            System.out.println("Please enter a valid amount");
        }
    }

    public void withdraw() {
        System.out.println("Please enter an amount you would like to withdraw");
        int withdrawAmount = scan.nextInt();

        if (withdrawAmount < this.balance) {
            if (this.withdrawCounter <= 3) {
                this.withdrawCounter++;
                this.balance -= withdrawAmount;
            } else {
                System.out
                        .println("You have reached your withdraw limit, Please deposit again to be able to witthdraw!");
            }
        } else {
            System.out.println("Your withdraw limit cannot be more then your balance!");
        }
    }




    // ? Constractors //
    // 1. Bank Construtor 1: Without parameters, default constructor from above
    public BankClass() {
        super();
    }

    // 2. Bank Constructor 3: Preset Nested Constructor
    public BankClass(String name) {
        this(number = 1, name, balance = 12321);
    }

    // 3. Bank Constructor 2: With parameters instead of using setAccount
    public BankClass(int number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    // 4. Bank Constructor 4: Create with alias
    public static BankClass presetAccountWithAliasBankConstructor(int number, String name, int balance) {
        return new BankClass(number, name, balance);
    }

}