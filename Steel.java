class Steel {

    String[] steels;
    int currentIndex = 0;

    Steel(String[] steels)
    {
        this.steels = steels;
    }

    void save(String steel)
    {
        int index = steels.length;

        if(steels != null)
        {
            System.out.println("Steel name: " + steel);
            System.out.println("Current index: " + currentIndex);

            if(currentIndex < index)
            {
                steels[currentIndex] = steel;
                currentIndex++;
            }
            else
            {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String steel)
    {
        if(steels != null)
        {
            for(String s : steels)
            {
                if(s == steel)
                {
                    System.out.println("Steel found: " + steel);
                    return true;
                }
            }
        }
        System.out.println("Steel not found");
        return false;
    }
	boolean update(int index, String value) {
    if (index >= 0 && index < steels.length) {
        System.out.println("Updating index " + index + " with value: " + value);
        steels[index] = value;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean update(String oldValue, String newValue) {
    if (steels != null) {
        for (int i = 0; i < steels.length; i++) {
            if (steels[i] != null && steels[i] == oldValue) {
                steels[i] = newValue;
                System.out.println("Updating old value: " + oldValue + " to new value: " + newValue);
                return true;
            }
        }
    }
    System.out.println("Value not found: " + oldValue);
    return false;
}

boolean delete(int index) {
    if (index >= 0 && index < steels.length) {
        System.out.println("Deleting steel at index: " + index);
        steels[index] = null;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean delete(String value) {
    if (steels != null) {
        for (int i = 0; i < steels.length; i++) {
            if (steels[i] != null && steels[i] == value) {
                System.out.println("Deleting steel: " + value);
                steels[i] = null;
                return true;
            }
        }
    }
    System.out.println("Steel not found");
    return false;
}
}