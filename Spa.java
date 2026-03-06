//Spa Tea Bell Cloud Aquarium

class Spa {

    int rooms;
    double price;
    float rating;
    char category;
    boolean open;

    Therapist therapist;
    Customer customer;
    Manager manager;
    Location location;
    Service service;

    Spa(int rooms,double price,float rating,char category,boolean open,
        Therapist therapist,Customer customer,Manager manager,Location location,Service service){

        this.rooms = rooms;
        this.price = price;
        this.rating = rating;
        this.category = category;
        this.open = open;
        this.therapist = therapist;
        this.customer = customer;
        this.manager = manager;
        this.location = location;
        this.service = service;
    }
	void getInfo()
{
    System.out.println("Rooms: " + rooms);
    System.out.println("Price: " + price);
    System.out.println("Rating: " + rating);
    System.out.println("Category: " + category);
    System.out.println("Open: " + open);

    if(therapist != null)
    {
        therapist.getInfo();
    }

    if(customer != null)
    {
        customer.getInfo();
    }

    if(manager != null)
    {
        manager.getInfo();
    }

    if(location != null)
    {
        location.getInfo();
    }

    if(service != null)
    {
        service.getInfo();
    }
}
}