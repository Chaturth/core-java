//Create below classes to save least 10 elements into array, add a search method to find by element Cylinder, Pasta, Petroleum, Singer, Tree,Steel,Kettle,Turbine,Scooter

class CylinderGas{
	
	String[] names;
	
	int currentIndex=0;
	
	CylinderGas(String[] names)
	{
		this.names=names;
	}
	
	void save(String name)
	{
		int index=names.length;
		
		if(names!=null)
		{
			System.out.println("saving names:"+name);
			System.out.println("currentIndex of name:"+currentIndex);
			
			if(currentIndex<index)
			{
				names[currentIndex]=name;
				currentIndex++;
			}
			else{
				System.out.println("Array is full");
			}
		}
	}
	boolean search(String name)
	{
		if(names!=null)
		{
			for(String n : names)
			{
				if(n == name)
				{
					System.out.println("name found:"+name);
					return true;
				}
			}
		}
		return false;
	}
}
