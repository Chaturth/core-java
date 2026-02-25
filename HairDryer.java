class HairDryer {
    int power;
    String brand;
    String color;
    double weight;
    double price;

    HairDryer(int power, String brand, String color, double weight, double price) {
        this.power = power;
        this.brand = brand;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    HairDryer(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    HairDryer(int power, double price) {
        this.power = power;
        this.price = price;
    }

    HairDryer(String brand, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    HairDryer(double price) {
        this.price = price;
    }

    HairDryer() {
    }
}