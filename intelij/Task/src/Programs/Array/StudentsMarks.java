package Programs.Array;
import java.util.Scanner;

public class StudentsMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        String[] subjectNames = new String[subjects];

        System.out.println("\nEnter Subject Names");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = sc.next();
        }

        int[][] marks = new int[students][subjects];
        int[] totals = new int[students];
        double[] averages = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            int total = 0;

            for (int j = 0; j < subjects; j++) {

                System.out.print("Enter marks for " + subjectNames[j] + ": ");
                marks[i][j] = sc.nextInt();

                total = total + marks[i][j];
            }

            totals[i] = total;
            averages[i] = total / (double) subjects;

            if (averages[i] >= 80) {
                grades[i] = 'A';
            } else if (averages[i] >= 60) {
                grades[i] = 'B';
            } else if (averages[i] >= 35) {
                grades[i] = 'C';
            } else {
                grades[i] = 'F';
            }
        }

        int topperIndex = 0;

        for (int i = 1; i < students; i++) {

            if (totals[i] > totals[topperIndex]) {
                topperIndex = i;
            }
        }

        System.out.println("\n STUDENT RESULT ");

        System.out.printf("%-12s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-12s %-12s %-8s%n",
                "Total", "Average", "Grade");

        System.out.println("------------------");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-12s", "Student " + (i + 1));

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12d", marks[i][j]);
            }

            System.out.printf("%-12d %-12.2f %-8c%n",
                    totals[i],
                    averages[i],
                    grades[i]);
        }

        System.out.println("\n= TOPPER =");

        System.out.printf("%-20s : Student %d%n",
                "Topper", topperIndex + 1);

        System.out.printf("%-20s : %d%n",
                "Total Marks", totals[topperIndex]);

        System.out.printf("%-20s : %.2f%n",
                "Average", averages[topperIndex]);

        System.out.printf("%-20s : %c%n",
                "Grade", grades[topperIndex]);

        sc.close();
    }
}
