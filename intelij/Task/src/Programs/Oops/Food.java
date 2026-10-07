package Programs.Oops;

class Food extends Product {
    String expiryDate;

    Food(int productId, String productName, double price, String expiryDate) {
        super(productId, productName, price);
        this.expiryDate = expiryDate;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date  : " + expiryDate);
    }
}
