class ControlStatement2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;
        boolean running = true;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited successfully!");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfully!");
                    } else {
                        System.out.println("Invalid withdraw amount.");
                    }
                    break;

                case 4:
                    System.out.println(" Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while(running);

        System.out.println("\nFinal balance countdown:");
        while (balance > 0) {
            System.out.println("Balance left: " + balance);
            balance -= 100;
        }
        System.out.println("Balance is now empty.");

        sc.close(); 
    }
}