package Programs;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter details of Student " + i);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Kannada marks: ");
            int kannada = sc.nextInt();

            System.out.print("Enter English marks: ");
            int english = sc.nextInt();

            System.out.print("Enter Science marks: ");
            int science = sc.nextInt();

            System.out.print("Enter Social marks: ");
            int social = sc.nextInt();

            System.out.print("Enter Hindi marks: ");
            int hindi = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            int maths = sc.nextInt();

            int total = kannada + english + science + social + hindi + maths;
            double average = total / 6.0;

            System.out.println();
            System.out.println("Student Details");

            System.out.printf("%-5s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                    "ID", "NAME", "KANNADA", "ENGLISH", "SCIENCE", "SOCIAL", "HINDI", "MATHS", "TOTAL", "AVERAGE");

            System.out.printf("%-5d %-15s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.2f%n",
                    id, name, kannada, english, science, social, hindi, maths, total, average);

            if (average >= 90) {
                System.out.println("GRADE: O");
            } else if (average >= 80) {
                System.out.println("GRADE: A");
            } else if (average >= 75) {
                System.out.println("GRADE: B");
            } else if (average >= 60) {
                System.out.println("GRADE: C");
            } else {
                System.out.println("GRADE: F");
            }

            System.out.println();
        }

        sc.close();
    }
}
