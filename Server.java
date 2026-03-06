class Server
{
    String serverName;

    Server(String serverName)
    {
        this.serverName = serverName;
    }

    void getInfo()
    {
        System.out.println("Server Name: " + serverName);
    }
}