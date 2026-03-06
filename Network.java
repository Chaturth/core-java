class Network
{
    String networkType;

    Network(String networkType)
    {
        this.networkType = networkType;
    }

    void getInfo()
    {
        System.out.println("Network Type: " + networkType);
    }
}