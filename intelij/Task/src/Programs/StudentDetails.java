package Programs;

public class StudentDetails {

    public static void main(String[] args) {

        String name = "akash";
        int id = 1;

        int test1Marks = 77;
        int test2Marks = 65;
        int test3Marks = 70;

        int total = test1Marks + test2Marks + test3Marks;
        double average = total / 3.0;

        System.out.printf("%-5s %-15s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "NAME", "TEST1", "TEST2", "TEST3", "TOTAL", "AVERAGE");

        System.out.printf("%-5d %-15s %-10d %-10d %-10d %-10d %.2f%n",
                id, name, test1Marks, test2Marks, test3Marks, total, average);
    }
}
