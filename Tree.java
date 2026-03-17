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
	
	boolean update(int index, String value) {
    if (index >= 0 && index < trees.length) {
        System.out.println("Updating index " + index + " with value: " + value);
        trees[index] = value;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean update(String oldValue, String newValue) {
    if (trees != null) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i] == oldValue) {
                trees[i] = newValue;
                System.out.println("Updating old value: " + oldValue + " to new value: " + newValue);
                return true;
            }
        }
    }
    System.out.println("Value not found: " + oldValue);
    return false;
}

boolean delete(int index) {
    if (index >= 0 && index < trees.length) {
        System.out.println("Deleting tree at index: " + index);
        trees[index] = null;
        return true;
    } else {
        System.out.println("Invalid index");
        return false;
    }
}

boolean delete(String value) {
    if (trees != null) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null && trees[i] == value) {
                System.out.println("Deleting tree: " + value);
                trees[i] = null;
                return true;
            }
        }
    }
    System.out.println("Tree not found");
    return false;
}
}