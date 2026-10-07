package Programs.Oops;

class WithoutDriver extends CarRental {
    int days;

    WithoutDriver(String carName, double rate, int days) {
        super(carName, rate);
        this.days = days;
    }

    @Override
    void calculateRent() {
        double total = rate * days;
        System.out.println("Car Name    : " + carName);
        System.out.println("Driver      : Without Driver");
        System.out.println("Days        : " + days);
        System.out.println("Total Rent  : " + total);
    }
}
