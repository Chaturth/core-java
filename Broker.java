class Broker {

    String[] clients;
    Person[] people;

    Broker(String[] clients, Person[] people) {
        this.clients = clients;
        this.people = people;
    }

    void display() {
        System.out.println("Length of clients: " + clients.length);
        for (String client : clients) {
            System.out.println("Client Name: " + client);
        }

        System.out.println("Length of people: " + people.length);
        for (Person p : people) {
            System.out.println("Person: " + p.name);
        }
    }
}