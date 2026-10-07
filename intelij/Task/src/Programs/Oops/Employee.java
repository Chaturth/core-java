package Programs.Oops;

 class Employee {



    int empId;
    String empName;

    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    void displayDetails(){
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee ID:"+empId);
    }

}
