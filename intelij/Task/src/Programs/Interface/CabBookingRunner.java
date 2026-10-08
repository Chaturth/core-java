package Programs.Interface;


public class CabBookingRunner {

    public static void main(String[] args) {

        CabBooking.MiniCab mini = new CabBooking.MiniCab("Rahul", 11);
        CabBooking.AutoCab auto = new CabBooking.AutoCab("Akash", 10);
        CabBooking.SedanCab sedan = new CabBooking.SedanCab("Kiran", 10);

        mini.bookRide();
        mini.calculateFare();

        System.out.println();

        auto.bookRide();
        auto.calculateFare();

        System.out.println();

        sedan.bookRide();
        sedan.calculateFare();
    }
}