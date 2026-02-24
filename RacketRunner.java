class RacketRunner {

    public static void main(String[] args)
    {

        Racket r1 = new Racket(
            300, 67, 4,
            2500.5, 22.5,
            "Yonex", "Blue",
            'A',
            true, true
        );

        System.out.println("Weight: " + r1.weight);
        System.out.println("Length: " + r1.length);
        System.out.println("GripSize: " + r1.gripSize);

        System.out.println("Price: " + r1.price);
        System.out.println("Tension: " + r1.tension);

        System.out.println("Brand: " + r1.brand);
        System.out.println("Color: " + r1.color);

        System.out.println("Quality: " + r1.quality);

        System.out.println("Strong: " + r1.strong);
        System.out.println("Original: " + r1.original);
    }
}