package com.xworkz.MedicalShop;

class AllTimeMedicalShop extends MedicalShop {

    boolean homeDelivery;
    String emergencyService;

    AllTimeMedicalShop(String shopName, int totalMedicines, double dailySales, String[] availableMedicines,
                       ShopType type, Owner owner, boolean homeDelivery, String emergencyService) {
        super(shopName, totalMedicines, dailySales, availableMedicines, type, owner);
        this.homeDelivery = homeDelivery;
        this.emergencyService = emergencyService;
    }

    @Override
    void openShop() {
        System.out.println(shopName + " is always open");
    }

    @Override
    void closeShop() {
        System.out.println(shopName + " does not close");
    }

    @Override
    public String toString() {
        return super.toString() + ", AllTimeMedicalShop[delivery=" + homeDelivery + ", emergency=" + emergencyService + "]";
    }
}
