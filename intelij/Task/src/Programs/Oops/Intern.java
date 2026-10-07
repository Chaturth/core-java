package Programs.Oops;

class Intern extends Employee {
    String college;

    Intern(int empId, String empName, String college) {
        super(empId, empName);
        this.college = college;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role  : Intern");
        System.out.println("College: " + college);
    }
}
