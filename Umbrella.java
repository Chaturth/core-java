class Umbrella{
	
	int cost;
	
	String color;
	
	String brand;
	
	double size;
	
	double qualityRating;
	
	Umbrella(int cost,String color,String brand,double size,double qualityRating)
	{
		this.cost=cost;
		this.color=color;
		this.brand=brand;
		this.size=size;
		this.qualityRating=qualityRating;
	}
	
	
	Umbrella(int cost,String color)
	{
		this.cost=cost;
		this.color=color;
	}
	
	Umbrella(String color,String brand)
	{
		this.color=color;
		this.brand=brand;
	}
	
	Umbrella(String brand,double size,double qualityRating)
	{
		this.brand=brand;
		this.size=size;
		this.qualityRating=qualityRating;
		
	}
	
	Umbrella(double qualityRating)
	{
		this.qualityRating=qualityRating;
	}
	
	Umbrella()
	{
	}
}
