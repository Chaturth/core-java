class Turbine {

    String[] turbines;
    int currentIndex = 0;

    Turbine(String[] turbines) {
        this.turbines = turbines;
    }

    void save(String turbine) {
        int index = turbines.length;

        if (turbines != null) {
            System.out.println("Turbine name: " + turbine);
            System.out.println("Current index: " + currentIndex);

            if (currentIndex < index) {
                turbines[currentIndex] = turbine;
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String turbine) {
        if (turbines != null) {
            for (String t : turbines) {
                if (t != null && t.equals(turbine)) {
                    System.out.println("Turbine found: " + turbine);
                    return true;
                }
            }
        }
        System.out.println("Turbine not found");
        return false;
    }

 
    boolean update(int index, String value) {
        if (index >= 0 && index < turbines.length) {
            System.out.println("Updating index " + index + " with value: " + value);
            turbines[index] = value;
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }


    boolean update(String oldValue, String newValue) {
        if (turbines != null) {
            for (int i = 0; i < turbines.length; i++) {
                if (turbines[i] != null && turbines[i].equals(oldValue)) {
                    turbines[i] = newValue;
                    System.out.println("Updated " + oldValue + " to " + newValue);
                    return true;
                }
            }
        }
        System.out.println("Value not found: " + oldValue);
        return false;
    }

    
    boolean delete(int index) {
        if (index >= 0 && index < turbines.length) {
            System.out.println("Deleting value at index: " + index);
            turbines[index] = null;
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }

    boolean delete(String value) {
        if (turbines != null) {
            for (int i = 0; i < turbines.length; i++) {
                if (turbines[i] != null && turbines[i].equals(value)) {
                    System.out.println("Deleting value: " + value);
                    turbines[i] = null;
                    return true;
                }
            }
        }
        System.out.println("Value not found: " + value);
        return false;
    }
}
