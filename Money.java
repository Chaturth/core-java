class Money {

    int moneyId;
    String currencyName;
    String country;
    double value;
    String symbol;
    String type;
    String material;
    int yearIntroduced;
    String governorName;
    String serialNumber;
    String color;
    double width;
    double height;
    boolean isValid;
    String status;

    static void usageInfo() {
        System.out.println("Used for buying and selling goods");
    }

    static void securityFeature() {
        System.out.println("Contains watermark and security thread");
    }

    static void digitalInfo() {
        System.out.println("Digital transactions are increasing");
    }

    static void exchangeInfo() {
        System.out.println("Exchange rate changes daily");
    }

    static void reserveBankInfo() {
        System.out.println("Issued by central bank");
    }

    void showDetails() {
        System.out.println(moneyId);
        System.out.println(currencyName);
        System.out.println(country);
        System.out.println(value);
        System.out.println(symbol);
        System.out.println(type);
        System.out.println(material);
        System.out.println(yearIntroduced);
        System.out.println(governorName);
        System.out.println(serialNumber);
        System.out.println(color);
        System.out.println(width);
        System.out.println(height);
        System.out.println(isValid);
        System.out.println(status);
    }
}