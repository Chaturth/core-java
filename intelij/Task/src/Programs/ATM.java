package Programs;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid amount");
                }
                else if (amount > balance) {
                    System.out.println("Insufficient balance");
                }
                else if (amount % 100 != 0) {
                    System.out.println("Enter amount in multiples of 100");
                }
                else {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                    System.out.println("Remaining balance = " + balance);
                }
                break;

            case 3:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();

                if (deposit <= 0) {
                    System.out.println("Invalid deposit amount");
                }
                else {
                    balance = balance + deposit;
                    System.out.println("Deposit successful");
                    System.out.println("Updated balance = " + balance);
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
