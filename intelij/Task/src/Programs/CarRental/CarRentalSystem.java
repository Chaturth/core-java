import java.util.*;
import java.io.*;

enum CarType {
    MINI, SEDAN, SUV
}

interface RentalOperations {

    void rentCar(String customerName, int days);

    void returnCar();

    double calculateFare(int days);

    void displayDetails();
}

abstract class Car implements RentalOperations {

    private int carId;
    private String carName;
    private double rentPerDay;
    private boolean available;

    protected String fuelType;

    static String companyName = "Smart Car Rentals";

    final int MAX_RENTAL_DAYS = 30;

    public Car(int carId, String carName, double rentPerDay, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.rentPerDay = rentPerDay;
        this.fuelType = fuelType;
        this.available = true;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        if (rentPerDay > 0) {
            this.rentPerDay = rentPerDay;
        } else {
            System.out.println("Rent must be greater than zero.");
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void startEngine() {
        System.out.println(carName + " engine started.");
    }

    public void stopEngine() {
        System.out.println(carName + " engine stopped.");
    }

    public double calculateFare(int days) {
        if (days <= 0 || days > MAX_RENTAL_DAYS) {
            return -1;
        }

        return rentPerDay * days;
    }

    public double calculateFare(int days, double discount) {
        double total = calculateFare(days);

        if (total < 0) {
            return -1;
        }

        return total - (total * discount / 100);
    }

    public abstract void displayDetails();

    public abstract void showCarType();

    @Override
    public void rentCar(String customerName, int days) {
        if (!available) {
            System.out.println(carName + " is not available.");
            return;
        }

        double fare = calculateFare(days);

        if (fare < 0) {
            System.out.println("Invalid rental days.");
            return;
        }

        available = false;

        System.out.println("\nCar rented successfully!");
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carName);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Fare: Rs. " + fare);
    }

    @Override
    public void returnCar() {
        if (available) {
            System.out.println(carName + " was not rented.");
            return;
        }

        available = true;

        System.out.println(carName + " returned successfully.");
    }

    @Override
    public String toString() {
        return "Car ID: " + carId
                + ", Name: " + carName
                + ", Rent Per Day: Rs. " + rentPerDay
                + ", Fuel: " + fuelType
                + ", Available: " + available;
    }
}

class MiniCar extends Car {

    private int seatingCapacity;

    public MiniCar(int carId, String carName, double rentPerDay,
                   String fuelType, int seatingCapacity) {

        super(carId, carName, rentPerDay, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- MINI CAR DETAILS ---");
        System.out.println(this);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

    @Override
    public void showCarType() {
        System.out.println("Car Type: MINI");
    }

    @Override
    public double calculateFare(int days) {
        double fare = super.calculateFare(days);

        if (fare < 0) {
            return -1;
        }

        return fare;
    }

    public void showMileage() {
        System.out.println(getCarName() + " is suitable for city travel.");
    }
}

class SedanCar extends Car {

    private boolean airConditioning;

    public SedanCar(int carId, String carName, double rentPerDay,
                    String fuelType, boolean airConditioning) {

        super(carId, carName, rentPerDay, fuelType);
        this.airConditioning = airConditioning;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- SEDAN CAR DETAILS ---");
        System.out.println(this);
        System.out.println("Air Conditioning: " + airConditioning);
    }

    @Override
    public void showCarType() {
        System.out.println("Car Type: SEDAN");
    }

    @Override
    public double calculateFare(int days) {
        double fare = super.calculateFare(days);

        if (fare < 0) {
            return -1;
        }

        return fare + 200;
    }

    public void showComfort() {
        System.out.println(getCarName() + " provides comfortable travel.");
    }
}

class SUVCar extends Car {

    private boolean fourWheelDrive;

    public SUVCar(int carId, String carName, double rentPerDay,
                  String fuelType, boolean fourWheelDrive) {

        super(carId, carName, rentPerDay, fuelType);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- SUV CAR DETAILS ---");
        System.out.println(this);
        System.out.println("Four Wheel Drive: " + fourWheelDrive);
    }

    @Override
    public void showCarType() {
        System.out.println("Car Type: SUV");
    }

    @Override
    public double calculateFare(int days) {
        double fare = super.calculateFare(days);

        if (fare < 0) {
            return -1;
        }

        return fare + 500;
    }

    public void showOffRoadCapability() {
        System.out.println(getCarName() + " is suitable for long trips.");
    }
}

class Customer {

    private int customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(int customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
    }

    @Override
    public String toString() {
        return customerId + " - " + customerName + " - " + phoneNumber;
    }
}

class RentalRecord {

    private Customer customer;
    private Car car;
    private int days;
    private double fare;

    public RentalRecord(Customer customer, Car car, int days, double fare) {
        this.customer = customer;
        this.car = car;
        this.days = days;
        this.fare = fare;
    }

    public void displayRecord() {
        System.out.println("\n--- RENTAL RECORD ---");
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Car: " + car.getCarName());
        System.out.println("Rental Days: " + days);
        System.out.println("Fare: Rs. " + fare);
    }
}

class RentalManager {

    private ArrayList<Car> carList = new ArrayList<>();

    private LinkedList<RentalRecord> rentalHistory = new LinkedList<>();

    private LinkedList<Customer> customerList = new LinkedList<>();

    public void addCar(Car car) {
        carList.add(car);
        System.out.println("Car added successfully.");
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer added successfully.");
    }

    public void displayAllCars() {
        System.out.println("\n========== AVAILABLE CARS ==========");

        boolean found = false;

        for (Car car : carList) {
            if (car.isAvailable()) {
                car.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No cars are currently available.");
        }
    }

    public Car searchCar(int carId) {
        for (Car car : carList) {
            if (car.getCarId() == carId) {
                return car;
            }
        }

        return null;
    }

    public Customer searchCustomer(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }

        return null;
    }

    public void rentCar(int carId, int customerId, int days) {
        Car car = searchCar(carId);
        Customer customer = searchCustomer(customerId);

        if (car == null) {
            System.out.println("Car not found.");
            return;
        }

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (!car.isAvailable()) {
            System.out.println("Car is already rented.");
            return;
        }

        double fare = car.calculateFare(days);

        if (fare < 0) {
            System.out.println("Rental days must be between 1 and "
                    + car.MAX_RENTAL_DAYS + ".");
            return;
        }

        car.rentCar(customer.getCustomerName(), days);

        rentalHistory.addLast(
                new RentalRecord(customer, car, days, fare)
        );
    }

    public void returnCar(int carId) {
        Car car = searchCar(carId);

        if (car == null) {
            System.out.println("Car not found.");
            return;
        }

        car.returnCar();
    }

    public void displayRentalHistory() {
        System.out.println("\n========== RENTAL HISTORY ==========");

        if (rentalHistory.isEmpty()) {
            System.out.println("No rental records found.");
            return;
        }

        for (RentalRecord record : rentalHistory) {
            record.displayRecord();
        }
    }

    public void displayCustomers() {
        System.out.println("\n========== CUSTOMER LIST ==========");

        if (customerList.isEmpty()) {
            System.out.println("No customers registered.");
            return;
        }

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public void displayTotalCars() {
        System.out.println("Total Registered Cars: " + carList.size());
    }

    public void saveRentalHistory() {
        try (FileWriter writer = new FileWriter("rental_history.txt", true)) {

            for (RentalRecord record : rentalHistory) {
                writer.write("Rental record saved. ");
            }

            writer.write("Current rental history count: "
                    + rentalHistory.size() + System.lineSeparator());

            System.out.println("Rental history saved to file.");

        } catch (IOException e) {
            System.out.println("Error saving rental history: " + e.getMessage());
        }
    }
}


class CarRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RentalManager manager = new RentalManager();

        manager.addCar(new MiniCar(101, "Maruti Swift", 1500, "Petrol", 5));
        manager.addCar(new SedanCar(102, "Honda City", 2500, "Petrol", true));
        manager.addCar(new SUVCar(103, "Toyota Fortuner", 5000, "Diesel", true));

        manager.addCustomer(new Customer(1, "Chaturth", "9876543210"));
        manager.addCustomer(new Customer(2, "Rahul", "9876501234"));

        int choice;

        do {
            System.out.println("\n========== CAR RENTAL SYSTEM ==========");
            System.out.println("1. Display Available Cars");
            System.out.println("2. Search Car");
            System.out.println("3. Rent Car");
            System.out.println("4. Return Car");
            System.out.println("5. Display Customers");
            System.out.println("6. Display Rental History");
            System.out.println("7. Display Total Cars");
            System.out.println("8. Save Rental History");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        manager.displayAllCars();
                        break;

                    case 2:
                        System.out.print("Enter Car ID: ");
                        int searchId = sc.nextInt();

                        Car car = manager.searchCar(searchId);

                        if (car != null) {
                            car.displayDetails();
                        } else {
                            System.out.println("Car not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Car ID: ");
                        int carId = sc.nextInt();

                        System.out.print("Enter Customer ID: ");
                        int customerId = sc.nextInt();

                        System.out.print("Enter Rental Days: ");
                        int days = sc.nextInt();

                        manager.rentCar(carId, customerId, days);
                        break;

                    case 4:
                        System.out.print("Enter Car ID to Return: ");
                        int returnId = sc.nextInt();

                        manager.returnCar(returnId);
                        break;

                    case 5:
                        manager.displayCustomers();
                        break;

                    case 6:
                        manager.displayRentalHistory();
                        break;

                    case 7:
                        manager.displayTotalCars();
                        break;

                    case 8:
                        manager.saveRentalHistory();
                        break;

                    case 9:
                        System.out.println("Thank you for using "
                                + Car.companyName + "!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 9);

        sc.close();
    }
}