class DMartRunner {

    public static void main(String[] args) {

        DMartStore store = new DMartStore(3);

        DMart p1 = new DMart(1, "Milk", "Nandini", 2024, 2025, Type.Dairy, 50, 1);
        DMart p2 = new DMart(2, "Rice", "India Gate", 2023, 2026, Type.Groceries, 1200, 25);
        DMart p3 = new DMart(3, "TV", "Samsung", 2024, 2030, Type.Electronics, 45000, 10);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
		
		store. getProductById(1);
		
			store. getProductById(5);
			
			store.getPriceByProductName("Rice");
			
			store.getProductNameByCompanyName("Samsung");
			
			store. getmfgDateAndExpDateByProductName("Milk");
		
		

    }
}