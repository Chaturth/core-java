class Tree {

    String[] trees;
    int currentIndex = 0;

    Tree(String[] trees)
    {
        this.trees = trees;
    }

    void save(String tree)
    {
        int index = trees.length;

        if(trees != null)
        {
            System.out.println("Tree name: " + tree);
            System.out.println("Current index: " + currentIndex);

            if(currentIndex < index)
            {
                trees[currentIndex] = tree;
                currentIndex++;
            }
            else
            {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String tree)
    {
        if(trees != null)
        {
            for(String t : trees)
            {
                if(t == tree)
                {
                    System.out.println("Tree found: " + tree);
                    return true;
                }
            }
        }
        System.out.println("Tree not found");
        return false;
    }
}