class Kettle {

    String[] kettles;
    int currentIndex = 0;

    Kettle(String[] kettles) {
        this.kettles = kettles;
    }

    void save(String kettle) {
        int index = kettles.length;

        if (kettles != null) {
            System.out.println("Kettle name: " + kettle);
            System.out.println("Current index: " + currentIndex);

            if (currentIndex < index) {
                kettles[currentIndex] = kettle;
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(String kettle) {
        if (kettles != null) {
            for (String k : kettles) {
                if (k != null && k == kettle) {
                    System.out.println("Kettle found: " + kettle);
                    return true;
                }
            }
        }
        System.out.println("Kettle not found");
        return false;
    }

    boolean update(int index, String value) {
        if (index >= 0 && index < kettles.length) {
            System.out.println("updating value:" + value + " with index:" + index);
            kettles[index] = value;
            return true;
        } else {
            System.out.println("invalid index ");
        }
        return false;
    }

    boolean update(String oldValue, String newValue) {
        if (kettles != null) {
            for (int i = 0; i < kettles.length; i++) {
                if (kettles[i] != null && kettles[i] == oldValue) {
                    kettles[i] = newValue;
                    System.out.println("removing oldValue:" + oldValue);
                    System.out.println("updating new value:" + newValue);
                    return true;
                }
            }
        }
        return false;
    }

    boolean delete(int index) {
        if (index >= 0 && index < kettles.length) {
            System.out.println("Deleting kettle at index: " + index);
            kettles[index] = null;
            return true;
        } else {
            System.out.println("Invalid index");
            return false;
        }
    }

    boolean delete(String value) {
        if (kettles != null) {
            for (int i = 0; i < kettles.length; i++) {
                if (kettles[i] != null && kettles[i] == value) {
                    System.out.println("Deleting kettle: " + value);
                    kettles[i] = null;
                    return true;
                }
            }
        }
        System.out.println("Kettle not found");
        return false;
    }
}