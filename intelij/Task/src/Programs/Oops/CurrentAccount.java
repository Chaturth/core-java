package Programs.Oops;

class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String bankName, String accountHolder, double balance) {
        super(accountNumber, bankName, balance, accountHolder);
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type     : Current Account");
    }
}
