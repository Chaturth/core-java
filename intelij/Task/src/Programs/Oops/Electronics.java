package Programs.Oops;

class Electronics extends Product {
    int warranty;

    Electronics(int productId, String productName, double price, int warranty) {
        super(productId, productName, price);
        this.warranty = warranty;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty     : " + warranty + " years");
    }
}
