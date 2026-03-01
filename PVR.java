class PVR {

    String theatreName;
    String location;
    String city;
    String state;
    int totalScreens;
    int totalSeats;
    boolean hasParking;
    boolean hasFoodCourt;
    boolean hasAC;
    String soundSystem;
    String screenType;
    String ticketBooking;
    String movieType;
    String ownerCompany;
    int openingYear;
    double ticketPrice;
    String popularMovie;
    String timing;
    String contactNumber;
    String remarks;


    PVR(String theatreName, String location, String city, String state,
        int totalScreens, int totalSeats, boolean hasParking,
        boolean hasFoodCourt, boolean hasAC, String soundSystem,
        String screenType, String ticketBooking, String movieType,
        String ownerCompany, int openingYear, double ticketPrice,
        String popularMovie, String timing, String contactNumber,
        String remarks)
    {
        this.theatreName = theatreName;
        this.location = location;
        this.city = city;
        this.state = state;
        this.totalScreens = totalScreens;
        this.totalSeats = totalSeats;
        this.hasParking = hasParking;
        this.hasFoodCourt = hasFoodCourt;
        this.hasAC = hasAC;
        this.soundSystem = soundSystem;
        this.screenType = screenType;
        this.ticketBooking = ticketBooking;
        this.movieType = movieType;
        this.ownerCompany = ownerCompany;
        this.openingYear = openingYear;
        this.ticketPrice = ticketPrice;
        this.popularMovie = popularMovie;
        this.timing = timing;
        this.contactNumber = contactNumber;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running PVR:");

        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Parking Available: " + hasParking);
        System.out.println("Food Court Available: " + hasFoodCourt);
        System.out.println("AC Available: " + hasAC);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Ticket Booking: " + ticketBooking);
        System.out.println("Movie Type: " + movieType);
        System.out.println("Owner Company: " + ownerCompany);
        System.out.println("Opening Year: " + openingYear);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Popular Movie: " + popularMovie);
        System.out.println("Timing: " + timing);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}