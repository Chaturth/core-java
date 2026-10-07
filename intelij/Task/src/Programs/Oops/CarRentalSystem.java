package Programs.Oops;

public class CarRentalSystem {
    public static void main(String[] args) {

        TimeRental t = new TimeRental("Swift", 500, 5);

        DayRental d = new DayRental("Honda City", 2000, 3);

        WithDriver w = new WithDriver("Innova", 2500, 2);

        WithoutDriver wo = new WithoutDriver("Creta", 2000, 2);

        System.out.println("----- Time Based Rental -----");
        t.calculateRent();

        System.out.println("\n----- Day Based Rental -----");
        d.calculateRent();

        System.out.println("\n----- With Driver -----");
        w.calculateRent();

        System.out.println("\n----- Without Driver -----");
        wo.calculateRent();
    }
}
