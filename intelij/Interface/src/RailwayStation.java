public interface RailwayStation {

    int platforms = 8;
    String stationName = "Majestic";
    int trains = 100;

    void bookTicket();
    void cancelTicket();

    default void announcement() {
        System.out.println("Train announcement given");
    }

    default void waitingHall() {
        System.out.println("Waiting hall available");
    }

    static void stationInfo() {
        System.out.println("RailwayStation interface");
    }
}
