package Programs.Oops;

class WithDriver extends CarRental {
    int days;

    WithDriver(String carName, double rate, int days) {
        super(carName, rate);
        this.days = days;
    }

    @Override
    void calculateRent() {
        double total = (rate + 1000) * days;
        System.out.println("Car Name    : " + carName);
        System.out.println("Driver      : With Driver");
        System.out.println("Days        : " + days);
        System.out.println("Total Rent  : " + total);
    }
}
