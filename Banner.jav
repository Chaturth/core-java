class Banner {

    String[] messages;
    Location[] locations;

    Banner(String[] messages, Location[] locations) {
        this.messages = messages;
        this.locations = locations;
    }

    void display() {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.println("Message: " + msg);
        }

        System.out.println("Number of locations: " + locations.length);
        for (Location loc : locations) {
            System.out.println("Location: " + loc.name);
        }
    }
}