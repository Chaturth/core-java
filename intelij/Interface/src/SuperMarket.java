public interface SuperMarket {

    int products = 5000;
    String marketName = "Dmart";
    int floors = 3;

    void sellProducts();
    void addStock();

    default void offerDiscount() {
        System.out.println("Discount available");
    }

    default void customerSupport() {
        System.out.println("Customer support available");
    }

    static void marketInfo() {
        System.out.println("SuperMarket interface");
    }
}
