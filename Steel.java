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
}