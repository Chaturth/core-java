package Programs.Oops;

 class Manager extends Employee{
     String department;
     Manager(int empId, String empName,String department) {
         super(empId, empName);
         this.department = department;
     }

         void displayDetails(){

         super.displayDetails();
             System.out.println("Role: Manager");
             System.out.println("Department:"+department);

         }
     }

