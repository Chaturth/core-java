class Track {
    String type;
    double length;
    String surface;
    int lanes;
    double rating;

    Track(String type, double length, String surface, int lanes, double rating) {
        this.type = type;
        this.length = length;
        this.surface = surface;
        this.lanes = lanes;
        this.rating = rating;
    }

    Track(String type, String surface) {
        this.type = type;
        this.surface = surface;
    }

    Track(double length, int lanes) {
        this.length = length;
        this.lanes = lanes;
    }

    Track(String type, double rating) {
        this.type = type;
        this.rating = rating;
    }

    Track(int lanes) {
        this.lanes = lanes;
    }

    Track() {}
}