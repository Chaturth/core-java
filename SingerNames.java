class SingerNames {
	
	String[] names;
	int currentIndex=0;	
	
	SingerNames(String[] names)
	{
		this.names=names;
	}
	
	void storenames(String name)
	{
		int index=names.length;
		
		if(names!=null)
		{
			System.out.println("name of singer:"+name);
			System.out.println("Current index:"+currentIndex);
			
			if(currentIndex<index)
			{
				names[currentIndex]=name;
				currentIndex++;
			
			}
			else{
				System.out.println("array if full");
			}
		}
	}
}

	