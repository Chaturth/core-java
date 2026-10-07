package Programs.Oops;

public class BankAccount {
    String BankName;
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String bankName, double balance,String accountHolder) {
        this.accountNumber = accountNumber;
        BankName = bankName;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){

        balance = balance+amount;
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayDetails(){
            System.out.println("Bank name:"+BankName);
            System.out.println("account number:"+accountNumber);
            System.out.println("account holder name:"+accountHolder);
            System.out.println("balance :"+balance);
        }

    }

