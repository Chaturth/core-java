package Programs;

import java.util.Scanner;

public class Resort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Resort Room Booking ");
        System.out.println("1. Standard Room - Rs. 2000");
        System.out.println("2. Deluxe Room - Rs. 3500");
        System.out.println("3. Suite Room - Rs. 5000");
        System.out.println("4. Family Room - Rs. 6000");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        double price;

        switch (choice) {

            case 1:
                price = 2000;
                System.out.println("Standard Room selected");
                System.out.println("Total amount = " + (price * days));
                break;

            case 2:
                price = 3500;
                System.out.println("Deluxe Room selected");
                System.out.println("Total amount = " + (price * days));
                break;

            case 3:
                price = 5000;
                System.out.println("Suite Room selected");
                System.out.println("Total amount = " + (price * days));
                break;

            case 4:
                price = 6000;
                System.out.println("Family Room selected");
                System.out.println("Total amount = " + (price * days));
                break;

            default:
                System.out.println("Invalid room choice");
        }

        sc.close();
    }
}
