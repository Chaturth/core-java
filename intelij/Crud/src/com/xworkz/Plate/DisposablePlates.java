package com.xworkz.Plate;

class DisposablePlate extends Plate {

    boolean ecoFriendly;
    String materialQuality;

    DisposablePlate(String color, int diameter, double price, String[] uses,
                    PlateType type, Manufacturer manufacturer, boolean ecoFriendly, String materialQuality) {
        super(color, diameter, price, uses, type, manufacturer);
        this.ecoFriendly = ecoFriendly;
        this.materialQuality = materialQuality;
    }

    @Override
    void usePlate() {
        System.out.println("Using disposable plate for one-time use");
    }

    @Override
    void washPlate() {
        System.out.println("No need to wash disposable plate");
    }

    @Override
    public String toString() {
        return super.toString() + ", DisposablePlate[ecoFriendly=" + ecoFriendly + ", quality=" + materialQuality + "]";
    }
}
