package com.xworkz.grocery;

public class GroceryStore {

    Grocery[] grocery;
    int currentIndex;

    public GroceryStore(Grocery[] grocery) {
        this.grocery = grocery;
    }

    void addGrocery(Grocery groceries){
        int index= grocery.length;
        if(groceries!=null)
        {
            if(currentIndex<index)
            {
                grocery[currentIndex]=groceries;
                currentIndex++;
                System.out.println("grocery is added");
            }
        }
    }

    void updateByName(String name, String newName)
    {
        boolean found=false;
        if(grocery!=null)
        {
            for(Grocery g : grocery)
            {
                if(g!=null && g.name.equals(name))
                {
                    g.name=newName;
                    System.out.println("updated now:"+newName);
                    found=true;
                    break;
                }
            }
        }
        if(!found)
        {
            System.out.println("not updated");
        }
    }
    void searchByName(String name)
    {
        boolean found = false;
        if(grocery!=null)
        {
            for(Grocery g:grocery)
            {
                if(g!=null && g.name.equals(name))
                {

                    System.out.println("name is found:"+g.name);
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("name not found");
        }
    }

    void display()
    {
        for(Grocery g:grocery)
        {
           if(g!=null)
           {
               g.display();
           }
        }
    }
}
