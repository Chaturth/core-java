package Programs.Interface;

interface CabBooking {

    void bookRide();
    void calculateFare();

    class Customer {

        String customerName;
        double distance;

        Customer(String customerName, double distance) {
            this.customerName = customerName;
            this.distance = distance;
        }
    }

    class MiniCab extends Customer implements CabBooking {

        MiniCab(String customerName, double distance) {
            super(customerName, distance);
        }

        @Override
        public void bookRide() {
            if (distance < 10) {
                System.out.println("MiniCab is booked to: " + customerName);
            } else {
                System.out.println("MiniCab is not available");
            }
        }

        @Override
        public void calculateFare() {
            if (distance < 10) {
                double fare = distance * 15;
                System.out.println("Mini cab fare is: " + fare);
            } else {
                System.out.println("Mini cab fare cannot be calculated");
            }
        }
    }

     class AutoCab extends Customer implements CabBooking{

         AutoCab(String customerName, double distance) {
            super(customerName, distance);
        }

        @Override
        public void bookRide() {

            System.out.println("Book a autocab to:"+customerName);

        }

        @Override
        public void calculateFare() {

             double fare;
             fare=distance*12;
            System.out.println("Autocab fare is:"+fare);

        }
    }
    class SedanCab extends Customer implements CabBooking {

        SedanCab(String customerName, double distance) {
            super(customerName, distance);
        }

        public void bookRide() {
            System.out.println("Sedan Cab booked for " + customerName);
        }

        public void calculateFare() {
            double fare = distance * 18;
            System.out.println("Sedan Cab Fare: " + fare);
        }
    }
}
