class Pawn {
    String color;
    String material;
    double height;
    double weight;
    double price;

    Pawn(String color, String material, double height, double weight, double price) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    Pawn(String color, String material) {
        this.color = color;
        this.material = material;
    }

    Pawn(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    Pawn(String color, double price) {
        this.color = color;
        this.price = price;
    }

    Pawn(double height) {
        this.height = height;
    }

    Pawn() {}
}