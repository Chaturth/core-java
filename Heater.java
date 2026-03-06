class Heater
{
    int temperature;

    Heater(int temperature)
    {
        this.temperature = temperature;
    }

    void getInfo()
    {
        System.out.println("Heater Temperature: " + temperature);
    }
}