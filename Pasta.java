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
}
	
	