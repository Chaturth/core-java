package Programs.Oops;

public class OnlineShopping {
    public static void main(String[] args) {

        Electronics e = new Electronics(101, "Laptop", 55000, 2);

        Clothing c = new Clothing(102, "Shirt", 1200, "L");

        Food f = new Food(103, "Biscuits", 50, "20-12-2026");

        System.out.println("----- Electronics -----");
        e.displayDetails();

        System.out.println("\n----- Clothing -----");
        c.displayDetails();

        System.out.println("\n----- Food -----");
        f.displayDetails();
    }
}
