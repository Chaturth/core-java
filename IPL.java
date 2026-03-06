//Ipl Spa Tea Bell Cloud Aquarium

class IPL {

    int seasons;
    double revenue;
    float rating;
    char group;
    boolean playoffs;

    Teams teams;
    Stadiums stadiums;
    Player player;
    Coachh coach;
    Umpire umpire;

    IPL(int seasons,double revenue,float rating,char group,boolean playoffs,
        Teams teams,Stadiums stadiums,Player player,Coachh coach,Umpire umpire){

        this.seasons = seasons;
        this.revenue = revenue;
        this.rating = rating;
        this.group = group;
        this.playoffs = playoffs;
        this.teams = teams;
        this.stadiums = stadiums;
        this.player = player;
        this.coach = coach;
        this.umpire = umpire;
    }
	
	void getInfo()
{
    System.out.println("Seasons: " + seasons);
    System.out.println("Revenue: " + revenue);
    System.out.println("Rating: " + rating);
    System.out.println("Group: " + group);
    System.out.println("Playoffs: " + playoffs);

    if(teams != null)
    {
        teams.getInfo();
    }

    if(stadiums != null)
    {
        stadiums.getInfo();
    }

    if(player != null)
    {
        player.getInfo();
    }

    if(coach != null)
    {
        coach.getInfo();
    }

    if(umpire != null)
    {
        umpire.getInfo();
    }
}
}