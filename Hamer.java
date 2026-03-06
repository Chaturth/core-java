//Declare below classes , then declare 15 instance methods, then declare 5 static methods, then create 2 instances of each class, invoke all the methods Hamper Dolphin Bridge Penguin TennisBall Mountain Flag Missle Money Resource

class Hamper{
	int hamperId;
	String material;
	String color;
	double capacity;
	String shape;
	int height;
	int width;
	int depth;
	boolean hasfoldable;
	int price;
	String brand;
	String location;
	String status;

	
	 static  void companyPolicy()
	{
		System.out.println("all hampers come with one year gurantee");
	}
	
	static void  displayColors()
	{
		System.out.println("white,black");
	}
	static void  capacityInfo()
	{
		System.out.println("max capacity is 120L");
	}
	
	static void brnadInfo()
	{
		System.out.println("brand:ecohome hampers pvt limited");
	}
	
	static void priceDisplay()
	{
		System.out.println("price varies from 100 rs to 1500 rs");
	}
    void showDetails() {
        System.out.println("Hamper ID: " + hamperId);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity);
        System.out.println("Shape: " + shape);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println("Foldable: " + hasfoldable);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
    }
}


	
		