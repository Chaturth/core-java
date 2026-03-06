class Service
{
    String serviceName;

    Service(String serviceName)
    {
        this.serviceName = serviceName;
    }

    void getInfo()
    {
        System.out.println("Service: " + serviceName);
    }
}