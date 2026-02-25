class Carrom {
    String brand;
    String material;
    double size;
    double thickness;
    double price;

    Carrom(String brand, String material, double size, double thickness, double price) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.thickness = thickness;
        this.price = price;
    }

    Carrom(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    Carrom(double size, double thickness) {
        this.size = size;
        this.thickness = thickness;
    }

    Carrom(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Carrom(double thickness) {
        this.thickness = thickness;
    }

    Carrom() {}
}