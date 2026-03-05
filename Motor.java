class Motor {

    int speed;
    double price;
    float mileage;
    char grade;
    boolean electric;

    String brand;
    Battery battery;
    Engine engine;
    Company company;
    Driver driver;

    Motor(int speed,
          double price,
          float mileage,
          char grade,
          boolean electric,
          String brand,
          Battery battery,
          Engine engine,
          Company company,
          Driver driver) {

        this.speed = speed;
        this.price = price;
        this.mileage = mileage;
        this.grade = grade;
        this.electric = electric;
        this.brand = brand;
        this.battery = battery;
        this.engine = engine;
        this.company = company;
        this.driver = driver;
    }
}