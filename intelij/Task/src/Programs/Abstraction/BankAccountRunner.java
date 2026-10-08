package Programs.Abstraction;

public class BankAccountRunner {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("Rahul", 50000);
        CurrentAccount current = new CurrentAccount("Akash", 50000);

        savings.displayAccount();
        savings.calculateInterest();

        System.out.println();

        current.displayAccount();
        current.calculateInterest();
    }
}

