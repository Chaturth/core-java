class Battery
{
    int capacity;

    Battery(int capacity)
    {
        this.capacity = capacity;
    }

    void getInfo()
    {
        System.out.println("Battery Capacity: " + capacity);
    }
}