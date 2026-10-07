package Programs.Oops;

class DayRental extends CarRental {
    int days;

    DayRental(String carName, double rate, int days) {
        super(carName, rate);
        this.days = days;
    }

    @Override
    void calculateRent() {
        double total = rate * days;
        System.out.println("Car Name    : " + carName);
        System.out.println("Rental Type : Day Basis");
        System.out.println("Days        : " + days);
        System.out.println("Total Rent  : " + total);
    }
}
