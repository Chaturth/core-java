package com.xworkz.Information;

class DigitalInformation extends Information {

    boolean isEncrypted;
    String format;

    DigitalInformation(String title, int pages, double sizeInMB, String[] keywords,
                       InfoType type, Source source, boolean isEncrypted, String format) {
        super(title, pages, sizeInMB, keywords, type, source);
        this.isEncrypted = isEncrypted;
        this.format = format;
    }

    @Override
    void displayInfo() {
        System.out.println("Displaying digital info on screen");
    }

    @Override
    void saveInfo() {
        System.out.println("Saving digital file securely");
    }

    @Override
    public String toString() {
        return super.toString() + ", DigitalInfo[encrypted=" + isEncrypted + ", format=" + format + "]";
    }
}
