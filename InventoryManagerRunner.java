public class InventoryManagerRunner {

    public static void main(String[] args) {

        InventoryManager product1 =
                new InventoryManager(
                        101,
                        "Laptop",
                        50,
                        5,
                        50000,
                        3,
                        true
                );

        System.out.println("Reorder Point: " +
                product1.calculateReorderPoint());

        System.out.println("Stock Status: " +
                product1.checkCurrentStock());

        System.out.println("Weekly Revenue: " +
                product1.calculateWeeklyRevenue());

        product1.restock(30);

        System.out.println("Average Inventory Value: " +
                InventoryManager.getAverageInventoryValue());
    }
}
	