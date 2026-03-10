class Joker {

    String[] jokes;
    Audience[] audiences;

    Joker(String[] jokes, Audience[] audiences) {
        this.jokes = jokes;
        this.audiences = audiences;
    }

    void display() {

        if (this.jokes != null) {
            System.out.println("Length of jokes: " + jokes.length);

            for (String joke : jokes) {
                System.out.println("Joke: " + joke);
            }
        }

        if (this.audiences != null) {
            System.out.println("Length of audiences: " + audiences.length);

            for (Audience a : audiences) {
                System.out.println("Audience: " + a.name);
            }
        }
    }
}