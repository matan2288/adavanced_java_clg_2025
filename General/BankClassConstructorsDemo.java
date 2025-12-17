public class BankClassConstructorsDemo {
    public static void main(String[] args) {

        //! Demo Constructors
        BankClass BankConstructor1 = new BankClass();
        BankConstructor1.setAccount(3212, "Matan", 15021);

        BankConstructor1.deposit();

        // BankClass BankConstructor2 = new BankClass(3212, "Matan", 15021.312);
        // BankConstructor2.viewAccountDetails();

        // BankClass BankConstructor3 = new BankClass(3212, "Matan", 15021.312);

        // BankConstructor3.viewAccountDetails();

        // BankClass BankConstructor4 = BankClass.presetAccountWithAliasBankConstructor(0, null, 0);
        // BankConstructor4.viewAccountDetails();

        //! Demo Polymorphisem
    }
}
