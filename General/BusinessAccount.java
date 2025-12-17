class BusinessAccount extends BankClass {
    //? Inheritance "extends"
    private boolean validateBusinessAccount() {
        if (this.getAccountBalance() > 100000) {
            return true;
        }
        System.out.println("Balance has to be more than 100000 to set up a Business Account");
        return false;
    }

    //? @Override with super()
    @Override
    public void setAccount(int number, String name, int balance) {
        if (validateBusinessAccount()) {
            super.setAccount(number, name, balance);
            System.out.println("Business Account has been set up succesfully");
        }
    }

}

// class BusinessAccountInheritance2 extends BankClass {

// }
