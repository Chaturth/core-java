public interface School {

    int classrooms = 40;
    String schoolName = "National School";
    int teachers = 80;

    void conductClass();
    void conductExam();

    default void morningPrayer() {
        System.out.println("Morning prayer started");
    }

    default void sportsActivity() {
        System.out.println("Sports activity conducted");
    }

    static void schoolInfo() {
        System.out.println("School interface");
    }
}
