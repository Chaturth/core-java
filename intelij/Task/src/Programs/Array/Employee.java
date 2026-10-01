package Programs.Array;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        String highestEmployee = "";
        double highestSalary = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details of Employee " + i);

            System.out.print("Enter employee name: ");
            String name = scanner.next();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            if (salary > highestSalary) {
                highestSalary = salary;
                highestEmployee = name;
            }
        }

        System.out.println("\nHighest Salary Employee");
        System.out.println("-----------------------");
        System.out.println("Employee Name : " + highestEmployee);
        System.out.println("Salary        : " + highestSalary);

        scanner.close();
    }
}
