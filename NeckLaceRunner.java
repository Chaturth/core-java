class NeckLaceRunner {

    public static void main(String[] args)
    {

        Necklace n1 = new Necklace(
            20, 50, 100, 101, 10,
            50000.5, 5.5, 91.6, 2000.5, 4.5,
            "Gold", "Metal", "Tanishq",
            "Traditional", "ABC Jewellers",
            'A', 'M',
            true, true, true
        );

        System.out.println("Length: " + n1.length);
        System.out.println("Weight: " + n1.weight);
        System.out.println("Beads: " + n1.beads);
        System.out.println("DesignNo: " + n1.designNo);
        System.out.println("Stock: " + n1.stock);

        System.out.println("Price: " + n1.price);
        System.out.println("Discount: " + n1.discount);
        System.out.println("Purity: " + n1.purity);
        System.out.println("MakingCharge: " + n1.makingCharge);
        System.out.println("Rating: " + n1.rating);

        System.out.println("Color: " + n1.color);
        System.out.println("Material: " + n1.material);
        System.out.println("Brand: " + n1.brand);
        System.out.println("Type: " + n1.type);
        System.out.println("ShopName: " + n1.shopName);

        System.out.println("Quality: " + n1.quality);
        System.out.println("SizeCode: " + n1.sizeCode);

        System.out.println("Gold: " + n1.gold);
        System.out.println("Diamond: " + n1.diamond);
        System.out.println("Available: " + n1.available);
    }
}