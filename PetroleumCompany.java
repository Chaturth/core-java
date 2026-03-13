// Create below classes to save 1. Petroleum Company names, i.e 5 2. Singer names , i.e 20 3. TwoWheeler model names i.e., 50 Program to find Reverse of a String Program to find armstrong number Program to sort array elements in desc order Program to sort array elements in asc order Program to find an element in array

class PetroleumCompany{
	
	String[] names;
	
	int currentIndex;
	
	PetroleumCompany(String[] names)
	{
		this.names=names;
	}
	
	void save(String name)
	{
		if(names!=null)
		{
			int index=this.names.length;
			
			if(this.currentIndex<index)
			{
				this.names[this.currentIndex]=name;
				System.out.println("the names is saved:"+name);
					System.out.println("current index"+currentIndex);
					
				this.currentIndex++;
					
			
		}
		
		else{
			System.out.println("Array is full,name cant be added");
		}
		}
	}
}
