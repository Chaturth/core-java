class InventoryManager {

    double productId;
    String productName;
    double currentStock;
    float dailySalesRate;
    int unitPrice;
    int leadTimeDays;
    boolean isSeasonal;

    static int totalProductsTracked = 0;
    static double totalInventoryValue = 0;

    InventoryManager(double productId,
                     String productName,
                     double currentStock,
                     float dailySalesRate,
                     int unitPrice,
                     int leadTimeDays,
                     boolean isSeasonal) {

        this.productId = productId;
        this.productName = productName;
        this.currentStock = currentStock;
        this.dailySalesRate = dailySalesRate;
        this.unitPrice = unitPrice;
        this.leadTimeDays = leadTimeDays;
        this.isSeasonal = isSeasonal;

        totalProductsTracked++;
        totalInventoryValue += (currentStock * unitPrice);
    }

    static double getAverageInventoryValue() {
        if (totalProductsTracked == 0) {
            return 0;
        }
        return totalInventoryValue / totalProductsTracked;
    }

    int calculateReorderPoint() {

        int reorderPoint = (int)(dailySalesRate * leadTimeDays * 1.5);

        if (isSeasonal) {
            reorderPoint = (int)(reorderPoint * 1.3);
        }

        if (currentStock < 20) {
            reorderPoint += 10;
        }

        return reorderPoint;
    }

    String checkCurrentStock() {

        if (currentStock <= 0) {
            return "Out of stock";
        }
        else if (currentStock <= calculateReorderPoint()) {
            return "Reorder needed - Order "
                    + (calculateReorderPoint() * 2 - currentStock) + " units";
        }
        else if (currentStock <= calculateReorderPoint() * 1.5) {
            return "Low stock";
        }
        else {
            return "Healthy stock";
        }
    }

    double calculateWeeklyRevenue() {

        int workingDays = 7;
        double stock = currentStock;
        double unitsSold = 0;

        while (stock >= dailySalesRate && workingDays > 0) {
            stock -= dailySalesRate;
            unitsSold += dailySalesRate;
            workingDays--;
        }

        return unitsSold * unitPrice;
    }

    void restock(int unitsReceived) {

        currentStock += unitsReceived;
        totalInventoryValue += (unitsReceived * unitPrice);

        System.out.println("Restocked: " + unitsReceived +
                " units of " + productName);
    }
}

		
			
			
		
		
	
	
	
	