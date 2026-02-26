class Zoo{
	String name;
	int noOfanimals;
	
	
	Zoo(String name)
	{
		
		this.name=name;
		 System.out.println("Constructor with name ");
	}
	
	Zoo(String name,int noOfanimals)
	{
		this.name=name;
		this.noOfanimals=noOfanimals;
		System.out.println("Constructor with name and no of animals:");
	}
	
	Zoo(int noOfanimals)
	{
		this.noOfanimals=noOfanimals;
	}
}
