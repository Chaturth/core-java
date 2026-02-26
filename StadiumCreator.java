class StadiumCreator{
	
	static void getStadium()
	{
		System.out.println("Default values:");
		
		System.out.println("stadium 1 is created:");
		
		Stadium s1= new Stadium("Chinnaswamy stadium");
		
		System.out.println("name of the statdium:"+s1.name);
	}
	
	static void getStadium(int capacity)
	{
		
		System.out.println("Stadium 2 is created:");
		
		Stadium s2=new Stadium(capacity);
		
			System.out.println("no of capacity:"+s2.capacity);
	}
	
	static void getStadium(String name,int capacity)
	{
		
		System.out.println("Stadium 3 is created:");
		
		Stadium s3=new Stadium(name,capacity);
		
		System.out.println("name of the statdium:"+s3.name);
		
			System.out.println("no of the capacity:"+s3.capacity);
	}
}
		
