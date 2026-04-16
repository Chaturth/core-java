package com.xworkz.Language;

class RegionalLanguage extends Language {

    boolean official;
    String region;

    RegionalLanguage(String name, int speakers, double difficulty, String[] examples,
                     LanguageType type, Creator creator, boolean official, String region) {
        super(name, speakers, difficulty, examples, type, creator);
        this.official = official;
        this.region = region;
    }

    @Override
    void speak() {
        System.out.println(name + " is widely spoken in " + region);
    }

    @Override
    void learn() {
        System.out.println("Learning " + name + " in easy way");
    }

    @Override
    public String toString() {
        return super.toString() + ", RegionalLanguage[official=" + official + ", region=" + region + "]";
    }
}
