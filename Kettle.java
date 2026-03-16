class Kettle {

    String[] kettles;
    int currentIndex = 0;

    Kettle(String[] kettles)
    {
        this.kettles = kettles;
    }

    void save(String kettle)
    {
        int index = kettles.length;

        if(kettles != null)
        {
            System.out.println("Kettle name: " + kettle);
            System.out.println("Current index: " + currentIndex);

            if(currentIndex < index)
            {
                kettles[currentIndex] = kettle;
                currentIndex++;
            }
            else
            {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String kettle)
    {
        if(kettles != null)
        {
            for(String k : kettles)
            {
                if(k == kettle)
                {
                    System.out.println("Kettle found: " + kettle);
                    return true;
                }
            }
        }
        System.out.println("Kettle not found");
        return false;
    }
}