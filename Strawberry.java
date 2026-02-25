class Strawberry {
    String color;
    double weight;
    double sweetness;
    String origin;
    double price;

    Strawberry(String color, double weight, double sweetness, String origin, double price) {
        this.color = color;
        this.weight = weight;
        this.sweetness = sweetness;
        this.origin = origin;
        this.price = price;
    }

    Strawberry(String color, double sweetness) {
        this.color = color;
        this.sweetness = sweetness;
    }

    Strawberry(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    Strawberry(String origin) {
        this.origin = origin;
        this.price = price;
    }

    Strawberry(double sweetness) {
        this.sweetness = sweetness;
    }

    Strawberry() {}
}