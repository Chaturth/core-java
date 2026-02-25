class Battery {
    String brand;
    int capacity;
    double voltage;
    double weight;
    double price;

    Battery(String brand, int capacity, double voltage, double weight, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.voltage = voltage;
        this.weight = weight;
        this.price = price;
    }

    Battery(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    Battery(double voltage, double weight) {
        this.voltage = voltage;
        this.weight = weight;
    }

    Battery(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Battery(int capacity) {
        this.capacity = capacity;
    }

    Battery() {}
}