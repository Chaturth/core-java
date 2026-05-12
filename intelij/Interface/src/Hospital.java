public interface Hospital {

    int doctors = 50;
    String hospitalName="Appolo";
    double rating = 4.5;

    void admitPatient();

    void dischargePatient();

    default void emergency(){
        System.out.println("yes emergency service is available");
    }

    default void pharmacy(){
        System.out.println("Pharmacy is open 24 hours in a day");

    }

    static void HospitalInfo(){

        System.out.println("check the website of the appolo hospital");
    }





}
