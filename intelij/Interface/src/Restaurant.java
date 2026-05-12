public interface Restaurant {

    int tables = 25;
    String restaurantName = "Udupi Cafe";
    String location = "Bangalore";

    void takeOrder();
    void serveFood();

    default void billPayment() {
        System.out.println("Bill payment completed");
    }

    default void provideWater() {
        System.out.println("Water provided");
    }

    static void restaurantInfo() {
        System.out.println("Restaurant interface");
    }
}
