class Necklace {

    int length;
    int weight;
    int beads;
    int designNo;
    int stock;

    double price;
    double discount;
    double purity;
    double makingCharge;
    double rating;

    String color;
    String material;
    String brand;
    String type;
    String shopName;

    char quality;
    char sizeCode;

    boolean gold;
    boolean diamond;
    boolean available;

    Necklace(int length, int weight, int beads, int designNo, int stock,
             double price, double discount, double purity,
             double makingCharge, double rating,
             String color, String material, String brand,
             String type, String shopName,
             char quality, char sizeCode,
             boolean gold, boolean diamond, boolean available) {

        this.length = length;
        this.weight = weight;
        this.beads = beads;
        this.designNo = designNo;
        this.stock = stock;

        this.price = price;
        this.discount = discount;
        this.purity = purity;
        this.makingCharge = makingCharge;
        this.rating = rating;

        this.color = color;
        this.material = material;
        this.brand = brand;
        this.type = type;
        this.shopName = shopName;

        this.quality = quality;
        this.sizeCode = sizeCode;

        this.gold = gold;
        this.diamond = diamond;
        this.available = available;
    }
}