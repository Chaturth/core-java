class Cloud{

    int nodes;
    double bandwidth;
    float latency;
    char zone;
    boolean active;

    Server server;
    Database database;
    Network network;
    Storage storage;
    Firewall firewall;

    Cloud(int nodes,double bandwidth,float latency,char zone,boolean active,
      Server server,Database database,Network network,Storage storage,Firewall firewall){

        this.nodes = nodes;
        this.bandwidth = bandwidth;
        this.latency = latency;
        this.zone = zone;
        this.active = active;
        this.server = server;
        this.database = database;
        this.network = network;
        this.storage = storage;
        this.firewall = firewall;
    }
	void getInfo()
{
    System.out.println("Nodes: " + nodes);
    System.out.println("Bandwidth: " + bandwidth);
    System.out.println("Latency: " + latency);
    System.out.println("Zone: " + zone);
    System.out.println("Active: " + active);

    if(server != null)
    {
        server.getInfo();
    }

    if(database != null)
    {
        database.getInfo();
    }

    if(network != null)
    {
        network.getInfo();
    }

    if(storage != null)
    {
        storage.getInfo();
    }

    if(firewall != null)
    {
        firewall.getInfo();
    }
}
}