package Programs.Array;

import java.util.Scanner;

public class HospitalTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        for (int i = 1; i <= patients; i++) {

            System.out.println("\nPatient " + i);

            double total = 0;
            boolean fever = false;

            for (int j = 1; j <= 3; j++) {

                System.out.print("Enter temperature for reading " + j + ": ");
                double temperature = sc.nextDouble();

                total = total + temperature;

                if (temperature >= 100.4) {
                    fever = true;
                }
            }

            double average = total / 3;

            System.out.println("Average Temperature: " + average);

            if (fever) {
                System.out.println("Status: Fever");
                System.out.println("Treatment: Continue the treatment");
            } else {
                System.out.println("Status: Normal");
                System.out.println("Treatment: Continue regular monitoring");
            }
        }

        sc.close();
    }
}
