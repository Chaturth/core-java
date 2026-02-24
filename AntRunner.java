class AntRunner {

    public static void main(String[] args)
    {

        Ant ant1 = new Ant(3, 6, "Black");
        Ant ant2 = new Ant(5, 6, "Red");

        System.out.println("Ant1 size: " + ant1.size);
        System.out.println("Ant1 legs: " + ant1.legs);
        System.out.println("Ant1 color: " + ant1.color);

        System.out.println("Ant2 size: " + ant2.size);
        System.out.println("Ant2 legs: " + ant2.legs);
        System.out.println("Ant2 color: " + ant2.color);
    }
}