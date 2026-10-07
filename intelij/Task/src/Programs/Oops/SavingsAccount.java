package Programs.Oops;

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String bankName, String accountHolder, double balance) {
        super(accountNumber, bankName, balance, accountHolder);
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type     : Savings Account");
    }
}
