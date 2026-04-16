package com.xworkz.MedicalShop;

class MedicalShop {

    String shopName;
    int totalMedicines;
    double dailySales;
    String[] availableMedicines;
    ShopType type;
    Owner owner;

    MedicalShop(String shopName, int totalMedicines, double dailySales, String[] availableMedicines, ShopType type, Owner owner) {
        this.shopName = shopName;
        this.totalMedicines = totalMedicines;
        this.dailySales = dailySales;
        this.availableMedicines = availableMedicines;
        this.type = type;
        this.owner = owner;
    }

    void openShop() {
        System.out.println(shopName + " is now open");
    }

    void closeShop() {
        System.out.println(shopName + " is now closed");
    }

    public String toString() {
        return "MedicalShop[name=" + shopName + ", medicines=" + totalMedicines + ", sales=" + dailySales + ", type=" + type + ", owner=" + owner + "]";
    }
}
