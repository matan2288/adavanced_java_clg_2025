public class BankAccountPolymorphisem {
    public void getAccountType() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println("Simple Name: " + simpleName);
    }

    public static void main(String[] args) {
    }
}

class ForeignAccount extends BankAccountPolymorphisem {
    public ForeignAccount() {
        this.getAccountType(); // Now works directly — inherited from parent
    }
}
