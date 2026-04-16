package com.xworkz.Language;

public class Language {

    String name;
    int speakers;
    double difficulty;
    String[] examples;
    LanguageType type;
    Creator creator;

    Language(String name, int speakers, double difficulty, String[] examples, LanguageType type, Creator creator) {
        this.name = name;
        this.speakers = speakers;
        this.difficulty = difficulty;
        this.examples = examples;
        this.type = type;
        this.creator = creator;
    }

    void speak() {
        System.out.println(name + " is being spoken");
    }

    void learn() {
        System.out.println("Learning " + name);
    }

    public String toString() {
        return "Language[name=" + name + ", speakers=" + speakers + ", difficulty=" + difficulty + ", type=" + type + ", creator=" + creator + "]";
    }
}
