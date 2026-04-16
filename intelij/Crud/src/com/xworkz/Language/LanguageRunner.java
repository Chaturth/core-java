package com.xworkz.Language;

public class LanguageRunner {
    public static void main(String[] args) {

        Creator c = new Creator("Ancient Origin", 0);
        String[] ex = {"Hello", "Namaste", "Vanakkam"};

        Language l = new Language("English", 500, 5.0, ex, LanguageType.ENGLISH, c);
        System.out.println(l);
        l.speak();
        l.learn();

        System.out.println("-----------");

        RegionalLanguage rl = new RegionalLanguage("Kannada", 500, 6.5, ex,
                LanguageType.KANNADA, c, true, "Karnataka");

        System.out.println(rl);
        rl.speak();
        rl.learn();
    }
}
