package com.xworkz.Concert;

class PremiumConcert extends Concert {

    boolean vipAccess;
    String stageType;

    PremiumConcert(String concertName, int audienceCount, double ticketPrice, String[] performers,
                   ConcertType type, Organizer organizer, boolean vipAccess, String stageType) {
        super(concertName, audienceCount, ticketPrice, performers, type, organizer);
        this.vipAccess = vipAccess;
        this.stageType = stageType;
    }

    @Override
    void startConcert() {
        System.out.println(concertName + " started with special lighting");
    }

    @Override
    void endConcert() {
        System.out.println(concertName + " closed with fireworks");
    }

    @Override
    public String toString() {
        return super.toString() + ", PremiumConcert[vip=" + vipAccess + ", stage=" + stageType + "]";
    }
}
