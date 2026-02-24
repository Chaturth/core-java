class ShoeLaceRunner {

    public static void main(String[] args)
    {

        ShoeLace s1 = new ShoeLace(
            120, 3, 2,
            50.5, 0.2,
            "White", "Nike",
            'A',
            true, true
        );

        System.out.println("Length: " + s1.length);
        System.out.println("Thickness: " + s1.thickness);
        System.out.println("Quantity: " + s1.quantity);

        System.out.println("Price: " + s1.price);
        System.out.println("Weight: " + s1.weight);

        System.out.println("Color: " + s1.color);
        System.out.println("Brand: " + s1.brand);

        System.out.println("Quality: " + s1.quality);

        System.out.println("Strong: " + s1.strong);
        System.out.println("Washable: " + s1.washable);
    }
}