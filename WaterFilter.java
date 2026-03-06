class WaterFilter
{
    String filterType;

    WaterFilter(String filterType)
    {
        this.filterType = filterType;
    }

    void getInfo()
    {
        System.out.println("Filter Type: " + filterType);
    }
}