package com.xworkz.Helmet;

class SmartHelmet extends Helmet {

    boolean hasBluetooth;
    String visorType;

    SmartHelmet(String brandName, int weightInGrams, double price, String[] safetyFeatures,
                HelmetUse use, Company company, boolean hasBluetooth, String visorType) {
        super(brandName, weightInGrams, price, safetyFeatures, use, company);
        this.hasBluetooth = hasBluetooth;
        this.visorType = visorType;
    }

    @Override
    void wearHelmet() {
        System.out.println("Wearing smart helmet with extra features");
    }

    @Override
    void removeHelmet() {
        System.out.println("Removing smart helmet carefully");
    }

    @Override
    public String toString() {
        return super.toString() + ", SmartHelmet[bluetooth=" + hasBluetooth + ", visor=" + visorType + "]";
    }
}
