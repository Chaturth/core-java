package com.xworkz.Information;

class Information {

    String title;
    int pages;
    double sizeInMB;
    String[] keywords;
    InfoType type;
    Source source;

    Information(String title, int pages, double sizeInMB, String[] keywords, InfoType type, Source source) {
        this.title = title;
        this.pages = pages;
        this.sizeInMB = sizeInMB;
        this.keywords = keywords;
        this.type = type;
        this.source = source;
    }

    void displayInfo() {
        System.out.println("Showing information: " + title);
    }

    void saveInfo() {
        System.out.println("Saving information");
    }

    public String toString() {
        return "Information[title=" + title + ", pages=" + pages + ", size=" + sizeInMB + "MB, type=" + type + ", source=" + source + "]";
    }
}
