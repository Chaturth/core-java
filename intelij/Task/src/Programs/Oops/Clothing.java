package Programs.Oops;

class Clothing extends Product {
    String size;

    Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Size         : " + size);
    }
}
