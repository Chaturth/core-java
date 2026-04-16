package com.xworkz.Actor;

class LeadActor extends Actor {

    boolean hasAward;
    String roleType;

    LeadActor(String actorName, int age, double salaryPerMovie, String[] hitMovies,
              Industry industry, Manager manager, boolean hasAward, String roleType) {
        super(actorName, age, salaryPerMovie, hitMovies, industry, manager);
        this.hasAward = hasAward;
        this.roleType = roleType;
    }

    @Override
    void act() {
        System.out.println(actorName + " is acting as hero");
    }

    @Override
    void attendEvent() {
        System.out.println(actorName + " attending big event");
    }

    @Override
    public String toString() {
        return super.toString() + ", LeadActor[award=" + hasAward + ", role=" + roleType + "]";
    }
}
