package Programs.Oops;

public class EmployeeDetails {

    public static void main(String[] args) {

        Manager m = new Manager(01,"Rajesh","HR");

        Developer d =new Developer(02,"Amith","Software development","Java");

        Intern i = new Intern(03,"akash","AIT");

        System.out.println("MANAGER DETAILS");
        m.displayDetails();
        System.out.println("\n");

        System.out.println("DEVELOPER DETAILS");
        d.displayDetails();
        System.out.println("\n");

        System.out.println("INTERN DETAILS");
        i.displayDetails();
    }
}
