package Programs;

public class EmployeeSalaryProcessing {
    public static void main(String[] args) {

        int id = 01;
        String name = "Chaturth Gowda";
        String department = "Software Development";
        String designation = "Java Developer";
        int yoe = 6;
        double basicSalary = 25000;

        double increment = 0;

        if (designation.equals("Java Developer")) {
            if (yoe > 5) {
                increment = basicSalary * 0.20;
            } else {
                increment = basicSalary * 0.10;
            }
        }

        double grossPay = basicSalary + increment;

        double netpay = grossPay - (grossPay * 0.10);

        if (designation.equals("Java Developer") && yoe > 5) {
            netpay = netpay + 5000;
        }

        double bonus = 0;

        if (department.equals("Software Development")) {
            bonus = 3000;
        } else if (department.equals("Testing")) {
            bonus = 2000;
        } else if (department.equals("HR")) {
            bonus = 1500;
        }

        double finalPay = netpay + bonus;

        System.out.printf("%-5s %-20s %-25s %-20s %-10s %-15s %-15s%n",
                "ID", "NAME", "DEPARTMENT", "DESIGNATION", "YOE", "NETPAY", "FINAL PAY");

        System.out.printf("%-5d %-20s %-25s %-20s %-10d %-15.2f %-15.2f%n",
                id, name, department, designation, yoe, netpay, finalPay);
    }
}
