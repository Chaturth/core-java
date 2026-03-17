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
