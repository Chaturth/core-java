class HealthRecord
{
    String status;

    HealthRecord(String status)
    {
        this.status = status;
    }

    void getInfo()
    {
        System.out.println("Health: " + status);
    }
}