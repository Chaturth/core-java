class ShoeLace {

    int length;
    int thickness;
    int quantity;

    double price;
    double weight;

    String color;
    String brand;

    char quality;

    boolean strong;
    boolean washable;

    ShoeLace(int length, int thickness, int quantity,
             double price, double weight,
             String color, String brand,
             char quality,
             boolean strong, boolean washable) {

        this.length = length;
        this.thickness = thickness;
        this.quantity = quantity;

        this.price = price;
        this.weight = weight;

        this.color = color;
        this.brand = brand;

        this.quality = quality;

        this.strong = strong;
        this.washable = washable;
    }
}