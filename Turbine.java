class Turbine {

    String[] turbines;
    int currentIndex = 0;

    Turbine(String[] turbines)
    {
        this.turbines = turbines;
    }

    void save(String turbine)
    {
        int index = turbines.length;

        if(turbines != null)
        {
            System.out.println("Turbine name: " + turbine);
            System.out.println("Current index: " + currentIndex);

            if(currentIndex < index)
            {
                turbines[currentIndex] = turbine;
                currentIndex++;
            }
            else
            {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String turbine)
    {
        if(turbines != null)
        {
            for(String t : turbines)
            {
                if(t == turbine)
                {
                    System.out.println("Turbine found: " + turbine);
                    return true;
                }
            }
        }
        System.out.println("Turbine not found");
        return false;
    }
}