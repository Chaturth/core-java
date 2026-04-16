package com.xworkz.Information;

class Source {

    String sourceName;
    String location;

    Source(String sourceName, String location) {
        this.sourceName = sourceName;
        this.location = location;
    }

    public String toString() {
        return "Source[name=" + sourceName + ", location=" + location + "]";
    }
}
