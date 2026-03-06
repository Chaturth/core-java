class RideFareCalculator {

    int distance;
    int time;
    boolean isSurgePricing;
    int waitingMinutes;

    double baseFare;
    double finalFare;

    RideFareCalculator(int distance, int time, boolean isSurgePricing, int waitingMinutes) {
        this.distance = distance;
        this.time = time;
        this.isSurgePricing = isSurgePricing;
        this.waitingMinutes = waitingMinutes;
    }

    void calculateDistanceFare() {

        if (distance <= 2) {
            baseFare = 5;
        } else {
            baseFare = 5 + (distance - 2) * 1.5;
        }
    }

    void addTimeCharge() {

        if (time >= 17 && time <= 20) {
            baseFare += 25;
        } else if (time >= 7 && time <= 9) {
            baseFare += 15;
        }
    }

    void addWaitingCharge() {

    if (waitingMinutes > 2) {

        for (int i = 3; i <= waitingMinutes; i++) {
            baseFare += 0.5;
        }

    }
}

    void applySurge() {

        if (isSurgePricing) {
            baseFare *= 1.5;
        }
    }

    void calculateFinalFare() {
        finalFare = baseFare;
        System.out.println("Final Fare: " + finalFare);
    }
}
