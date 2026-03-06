// Coach Ipl Spa Tea Bell Cloud Aquarium

class Coach {

    int experience;
    double salary;
    float rating;
    char level;
    boolean fullTime;

    Name name;
    Team team;
    Stadium stadium;
    Country country;
    Assistant assistant;

    Coach(int experience,
          double salary,
          float rating,
          char level,
          boolean fullTime,
          Name name,
          Team team,
          Stadium stadium,
          Country country,
          Assistant assistant) {

        this.experience = experience;
        this.salary = salary;
        this.rating = rating;
        this.level = level;
        this.fullTime = fullTime;
        this.name = name;
        this.team = team;
        this.stadium = stadium;
        this.country = country;
        this.assistant = assistant;
    }
	void getInfo()
{
    System.out.println("Experience: " + experience);
    System.out.println("Salary: " + salary);
    System.out.println("Rating: " + rating);
    System.out.println("Level: " + level);
    System.out.println("Full Time: " + fullTime);

    if(name != null)
    {
        name.getInfo();
    }

    if(team != null)
    {
        team.getInfo();
    }

    if(stadium != null)
    {
        stadium.getInfo();
    }

    if(country != null)
    {
        country.getInfo();
    }

    if(assistant != null)
    {
        assistant.getInfo();
    }
}
}