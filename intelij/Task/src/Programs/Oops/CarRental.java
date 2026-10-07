package Programs.Oops;

class CarRental {
    String carName;
    double rate;

    CarRental(String carName, double rate) {
        this.carName = carName;
        this.rate = rate;
    }

    void calculateRent() {
        System.out.println("Car Name : " + carName);
    }
}
