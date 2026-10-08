package Programs.Finalize;

public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }


    protected void finalize() {
        System.out.println("Cleaning student object: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rakshith");

        Student s2 = new Student("Rahul");

        s1 = null;

        s2 = null;

        System.gc();

        System.out.println("End of program");
    }
}
