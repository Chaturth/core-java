class Clip {
    String material;
    String color;
    double size;
    int strength;
    double price;

    Clip(String material, String color, double size, int strength, double price) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.strength = strength;
        this.price = price;
    }

    Clip(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Clip(double size, int strength) {
        this.size = size;
        this.strength = strength;
    }

    Clip(String material, double price) {
        this.material = material;
        this.price = price;
    }

    Clip(int strength) {
        this.strength = strength;
    }

    Clip() {}
}