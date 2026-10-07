package Programs.Oops;

public class BankingTransactionSystem {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(10123456, "SBI", "Rahul", 20000);
        CurrentAccount c = new CurrentAccount(10255678, "HDFC", "Akash", 50000);

        s.deposit(5000);
        s.withdraw(2000);

        c.deposit(10000);
        c.withdraw(5000);

        System.out.println("----- Savings Account -----");
        s.displayDetails();

        System.out.println("\n----- Current Account -----");
        c.displayDetails();
    }
}
