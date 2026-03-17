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
	
	boolean search(String name)
	{
		if(names!=null)
		{
			for(String n:names)
			{
			   if(n== name)
			   {
				   System.out.println("name found:"+name);
				   return true;
			   }
			}
		}
		
			System.out.println("name not found");
			return false;
		
		
	}
	
		boolean update(int index, String value) {
    if (index >= 0 && index < names.length) {
        System.out.println("Updating index " + index + " with value: " + value);
        names[index] = value;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean update(String oldValue, String newValue) {
    if (names != null) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i] == oldValue) {
                names[i] = newValue;
                System.out.println("Updating old value: " + oldValue + " to new value: " + newValue);
                return true;
            }
        }
    }
    System.out.println("Value not found: " + oldValue);
    return false;
}

boolean delete(int index) {
    if (index >= 0 && index < names.length) {
        System.out.println("Deleting name at index: " + index);
        names[index] = null;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean delete(String value) {
    if (names != null) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i] == value) {
                System.out.println("Deleting name: " + value);
                names[i] = null;
                return true;
            }
        }
    }
    System.out.println("Name not found");
    return false;
}
}

	