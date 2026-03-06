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
	void getInfo()
{
    System.out.println("Speed: " + speed);
    System.out.println("Price: " + price);
    System.out.println("Mileage: " + mileage);
    System.out.println("Grade: " + grade);
    System.out.println("Electric: " + electric);
    System.out.println("Brand: " + brand);

    if(battery != null)
    {
        battery.getInfo();
    }

    if(engine != null)
    {
        engine.getInfo();
    }

    if(company != null)
    {
        company.getInfo();
    }

    if(driver != null)
    {
        driver.getInfo();
    }
}
}