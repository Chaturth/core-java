// Create below classes to save 1. Petroleum Company names, i.e 5 2. Singer names , i.e 20 3. TwoWheeler model names i.e., 50 Program to find Reverse of a String Program to find armstrong number Program to sort array elements in desc order Program to sort array elements in asc order Program to find an element in array

class PetroleumCompany{
	
	String[] names;
	
	int currentIndex;
	
	PetroleumCompany(String[] names)
	{
		this.names = names;
	}
	
	void save(String name)
	{
		if(names != null)
		{
			int index = this.names.length;
			
			if(this.currentIndex < index)
			{
				this.names[this.currentIndex] = name;
				System.out.println("the names is saved:" + name);
				System.out.println("current index " + currentIndex);
					
				this.currentIndex++;
			}
			else{
				System.out.println("Array is full,name cant be added");
			}
		}
	}
		
	boolean search(String name)
	{
		if(names != null)
		{
			for(String n : names)
			{
				if(n == name)
				{
					System.out.println("Name found: " + name);
					return true;
				}
			}
		}
		
		System.out.println("Name not found: " + name);
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
    System.out.println("Name not found: " + value);
    return false;
}
}