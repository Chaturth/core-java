class DMart {

    int productId;
    String productName;
    String companyName;
    double mfDate;
    double expDate;
    Type type;
    double price;
    double weight;

    DMart(int productId, String productName, String companyName,
          double mfDate, double expDate, Type type,
          double price, double weight) {

        this.productId = productId;
        this.productName = productName;
        this.companyName = companyName;
        this.mfDate = mfDate;
        this.expDate = expDate;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }
}