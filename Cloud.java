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

    CloudWeb(int nodes,double bandwidth,float latency,char zone,boolean active,
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
}