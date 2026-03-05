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
}