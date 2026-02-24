class Cricket {

    int players;
    int overs;
    int wickets;
    int extras;
    int target;

    double score;
    double runRate;
    double strikeRate;
    double economy;
    double average;

    String teamName;
    String captain;
    String stadium;
    String country;
    String format;

    char grade;
    char pitchType;

    boolean win;
    boolean tossWin;
    boolean homeGround;

    Cricket(int players, int overs, int wickets, int extras, int target,
            double score, double runRate, double strikeRate,
            double economy, double average,
            String teamName, String captain, String stadium,
            String country, String format,
            char grade, char pitchType,
            boolean win, boolean tossWin, boolean homeGround) {

        this.players = players;
        this.overs = overs;
        this.wickets = wickets;
        this.extras = extras;
        this.target = target;

        this.score = score;
        this.runRate = runRate;
        this.strikeRate = strikeRate;
        this.economy = economy;
        this.average = average;

        this.teamName = teamName;
        this.captain = captain;
        this.stadium = stadium;
        this.country = country;
        this.format = format;

        this.grade = grade;
        this.pitchType = pitchType;

        this.win = win;
        this.tossWin = tossWin;
        this.homeGround = homeGround;
    }
}