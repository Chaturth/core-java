package Programs.Array;

import java.util.Scanner;

public class House {

    static void calculateHouseDetails(String[] ownerName, String[] houseType,
                                      String[] choice, double[] amount) {

        double total = 0;

        System.out.println("\n----------------");
        System.out.printf("%-15s %-15s %-12s %-12s%n",
                "Owner Name", "House Type", "Choice", "Amount");
        System.out.println("---------------");

        for (int i = 0; i < ownerName.length; i++) {

            System.out.printf("%-15s %-15s %-12s %.2f%n",
                    ownerName[i], houseType[i], choice[i], amount[i]);

            total = total + amount[i];
        }

        System.out.println("----------------------------");
        System.out.printf("Total Amount = %.2f%n", total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ownerName = new String[n];
        String[] houseType = new String[n];
        String[] choice = new String[n];
        double[] amount = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of House " + (i + 1));

            System.out.print("Enter owner name: ");
            ownerName[i] = sc.nextLine();

            System.out.print("Enter house type (1-BHK/2-BHK/3-BHK): ");
            houseType[i] = sc.nextLine();

            System.out.print("Enter choice (Rent/Lease): ");
            choice[i] = sc.nextLine();

            if (choice[i].equalsIgnoreCase("Rent")) {
                System.out.print("Enter monthly rent: ");
                amount[i] = sc.nextDouble();
            } else {
                System.out.print("Enter lease amount: ");
                amount[i] = sc.nextDouble();
            }

            sc.nextLine();
        }

        calculateHouseDetails(ownerName, houseType, choice, amount);

        sc.close();
    }
}
