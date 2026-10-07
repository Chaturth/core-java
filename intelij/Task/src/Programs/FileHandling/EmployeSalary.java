package Programs.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class EmployeSalary {

    public static void main(String[] args) {

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int total = 0;
        int count = 0;
        int above30000 = 0;

        String highestEmployee = "";
        String lowestEmployee = "";

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("employees.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int salary = Integer.parseInt(data[2]);

                System.out.println(
                        id + " " + name + " " + salary
                );

                total += salary;
                count++;

                if (salary > highest) {

                    highest = salary;
                    highestEmployee = name;
                }

                if (salary < lowest) {

                    lowest = salary;
                    lowestEmployee = name;
                }

                if (salary > 30000) {

                    above30000++;
                }
            }

            br.close();

            double average = (double) total / count;

            System.out.println("\nHighest Salary: "
                    + highestEmployee + " - " + highest);

            System.out.println("Lowest Salary: "
                    + lowestEmployee + " - " + lowest);

            System.out.println("Average Salary: " + average);

            System.out.println(
                    "Employees above 30000: " + above30000);

        } catch (IOException e) {

            System.out.println("Error reading file.");
        }
    }
}
