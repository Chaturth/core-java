package Programs.Oops;

public class Developer extends Employee{

    String department;
    String technology;
    Developer(int empId, String empName,String department,String technology) {
        super(empId, empName);
        this.department=department;
        this.technology=technology;
    }

   void displayDetails(){
        super.displayDetails();
       System.out.println("Role: Developer");
       System.out.println("Department:"+department);
       System.out.println("Technology:"+technology);
    }
}
