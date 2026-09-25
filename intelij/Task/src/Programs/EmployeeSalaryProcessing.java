package Programs;

public class EmployeeSalaryProcessing {
    public static void main(String[] args) {

        int id =01;
        String name= "Chaturth Gowda";
        String department="Software Development";
        String designation="Java Developer";
        int yoe= 0;
        double basicSalary=25000;

        double grossPay= basicSalary + (basicSalary*0.20);

        double netpay= grossPay-(grossPay*0.10);

        System.out.printf("%-5s %-20s %-20s %-10s %-15s%n",
                "ID", "NAME", "DEPARTMENT", "YOE", "NETPAY");

        System.out.printf("%-5d %-20s %-20s %-10d %-15.2f%n",
                id, name, department, yoe, netpay);
    }
}
