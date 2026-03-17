//Pasta, Petroleum, Singer, Tree,Steel,Kettle,Turbine,

class Pasta {

    String[] pastas;
    int currentIndex = 0;

    Pasta(String[] pastas)
    {
        this.pastas = pastas;
    }

    void storePasta(String pasta)
    {
        int index = pastas.length;

        if(pastas != null)
        {
            System.out.println("Pasta name: " + pasta);
            System.out.println("Current index: " + currentIndex);

            if(currentIndex < index)
            {
                pastas[currentIndex] = pasta;
                currentIndex++;
            }
            else
            {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String pasta)
    {
        if(pastas != null)
        {
            for(String p : pastas)
            {
                if(p == pasta)
                {
                    System.out.println("Pasta found: " + pasta);
                    return true;
                }
            }
        }
        System.out.println("Pasta not found");
        return false;
    }
	
	boolean update(int index, String value) {
    if (index >= 0 && index < pastas.length) {
        System.out.println("Updating index " + index + " with value: " + value);
        pastas[index] = value;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean update(String oldValue, String newValue) {
    if (pastas != null) {
        for (int i = 0; i < pastas.length; i++) {
            if (pastas[i] != null && pastas[i] == oldValue) {
                pastas[i] = newValue;
                System.out.println("Updating old value: " + oldValue + " to new value: " + newValue);
                return true;
            }
        }
    }
    System.out.println("Value not found: " + oldValue);
    return false;
}

boolean delete(int index) {
    if (index >= 0 && index < pastas.length) {
        System.out.println("Deleting pasta at index: " + index);
        pastas[index] = null;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean delete(String value) {
    if (pastas != null) {
        for (int i = 0; i < pastas.length; i++) {
            if (pastas[i] != null && pastas[i] == value) {
                System.out.println("Deleting pasta: " + value);
                pastas[i] = null;
                return true;
            }
        }
    }
    System.out.println("Pasta not found");
    return false;
}
}
	
	