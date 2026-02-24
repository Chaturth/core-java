class Racket {

    int weight;
    int length;
    int gripSize;

    double price;
    double tension;

    String brand;
    String color;

    char quality;

    boolean strong;
    boolean original;

    Racket(int weight, int length, int gripSize,
           double price, double tension,
           String brand, String color,
           char quality,
           boolean strong, boolean original) {

        this.weight = weight;
        this.length = length;
        this.gripSize = gripSize;

        this.price = price;
        this.tension = tension;

        this.brand = brand;
        this.color = color;

        this.quality = quality;

        this.strong = strong;
        this.original = original;
    }
}