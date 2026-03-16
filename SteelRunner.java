class SteelRunner {

    public static void main(String[] args)
    {
        String[] names = new String[10];
        Steel s = new Steel(names);

        s.save("Tata Steel");
        s.save("JSW Steel");
        s.save("SAIL Steel");
        s.save("Jindal Steel");
        s.save("Essar Steel");
        s.save("Bhushan Steel");
        s.save("AMNS Steel");
        s.save("RINL Steel");
        s.save("Kalyani Steel");
        s.save("Mukand Steel");

        boolean found = s.search("JSW Steel");

    }
}