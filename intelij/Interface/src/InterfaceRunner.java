public class InterfaceRunner {

    public static void main(String[] args) {

        Hospital hospital = new ApolloHospital();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.emergency();
        hospital.pharmacy();


        Restaurant restaurant = new UdupiRestaurant();
        restaurant.takeOrder();
        restaurant.serveFood();
        restaurant.billPayment();
        restaurant.provideWater();
        Restaurant.restaurantInfo();


        School school = new PublicSchool();
        school.conductClass();
        school.conductExam();
        school.morningPrayer();
        school.sportsActivity();
        School.schoolInfo();


        SuperMarket market = new Dmart();
        market.sellProducts();
        market.addStock();
        market.offerDiscount();
        market.customerSupport();
        SuperMarket.marketInfo();

        RailwayStation station = new BangaloreStation();
        station.bookTicket();
        station.cancelTicket();
        station.announcement();
        station.waitingHall();
        RailwayStation.stationInfo();
    }
}
