package Programs;
public class College {

    static String collegeName = "AIT College";

    static int studentCount = 0;

    String studentName;

    int rollNumber;

    public College(String name) {

        this.studentName = name;

        studentCount++;

        this.rollNumber = studentCount;
    }

    static void changeCollegeName(String newName){

        collegeName=newName;
    }

    void displayInfo() {

        System.out.println("Roll Number: " + rollNumber + " | Name: " + studentName + " | College: " + collegeName);
    }

    public static void main(String[] args) {

        College.changeCollegeName("BGS University");

        System.out.println("Initial College: " + College.collegeName);

        College c1 = new College("Rahul");

        College c2 = new College("Kiran");
        
        c1.displayInfo();

        c2.displayInfo();

        System.out.println("Total Students: " + College.studentCount);
    }
}
