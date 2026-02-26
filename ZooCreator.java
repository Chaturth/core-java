class ZooCreator{
	
	
	
	static void getZoo()
	{
		System.out.println("zoo 1 is created with default values:");
		
		Zoo z1=new Zoo("Mysore zoo");
		
		System.out.println("name of the zoo:"+z1.name);
		
		
	}
	
	static void getZoo(String name,int noOfanimals)
	{
		System.out.println("zoo 2 is created with default values:");
		
		Zoo z2=new Zoo(name,noOfanimals);
		System.out.println("name of the zoo:"+z2.name);
		System.out.println("name of the zoo:"+z2.noOfanimals);
		
	}
	
	
	
	static void getZoo(int noOfanimals)
	{
		System.out.println("zoo 3 is created with default values:");
		
		Zoo z3=new Zoo(noOfanimals);
		System.out.println("name of the zoo:"+z3.noOfanimals);
	}
}


		
		
		
		