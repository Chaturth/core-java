class RideFareCalculatorRunner {
    public static void main(String[] args) {

        RideFareCalculator ride =
                new RideFareCalculator(10, 18, true, 5);

        ride.calculateDistanceFare();
        ride.addTimeCharge();
        ride.addWaitingCharge();
        ride.applySurge();
        ride.calculateFinalFare();
    }
}

