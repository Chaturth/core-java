class Firewall
{
    String firewallName;

    Firewall(String firewallName)
    {
        this.firewallName = firewallName;
    }

    void getInfo()
    {
        System.out.println("Firewall: " + firewallName);
    }
}