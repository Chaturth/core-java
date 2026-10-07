package Programs.Oops;

class TimeRental extends CarRental {
    int hours;

    TimeRental(String carName, double rate, int hours) {
        super(carName, rate);
        this.hours = hours;
    }

    @Override
    void calculateRent() {
        double total = rate * hours;
        System.out.println("Car Name    : " + carName);
        System.out.println("Rental Type : Time Basis");
        System.out.println("Hours       : " + hours);
        System.out.println("Total Rent  : " + total);
    }
}
