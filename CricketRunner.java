class CricketRunner {

    public static void main(String[] args)
    {

        Cricket c1 = new Cricket(
            11, 20, 5, 10, 180,
            175.5, 8.5, 120.5, 6.2, 45.3,
            "India", "Rohit", "Chinnaswamy",
            "India", "T20",
            'A', 'H',
            true, false, true
        );

        System.out.println("Players: " + c1.players);
        System.out.println("Overs: " + c1.overs);
        System.out.println("Wickets: " + c1.wickets);
        System.out.println("Extras: " + c1.extras);
        System.out.println("Target: " + c1.target);

        System.out.println("Score: " + c1.score);
        System.out.println("RunRate: " + c1.runRate);
        System.out.println("StrikeRate: " + c1.strikeRate);
        System.out.println("Economy: " + c1.economy);
        System.out.println("Average: " + c1.average);

        System.out.println("Team: " + c1.teamName);
        System.out.println("Captain: " + c1.captain);
        System.out.println("Stadium: " + c1.stadium);
        System.out.println("Country: " + c1.country);
        System.out.println("Format: " + c1.format);

        System.out.println("Grade: " + c1.grade);
        System.out.println("PitchType: " + c1.pitchType);

        System.out.println("Win: " + c1.win);
        System.out.println("TossWin: " + c1.tossWin);
        System.out.println("HomeGround: " + c1.homeGround);
    }
}