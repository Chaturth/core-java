class BlanketRunner {

    public static void main(String[] args)
    {

        Blanket b1 = new Blanket(6, 4, "Cotton", 500.5, true);

        System.out.println("Length: " + b1.length);
        System.out.println("Width: " + b1.width);
        System.out.println("Material: " + b1.material);
        System.out.println("Price: " + b1.price);
        System.out.println("Warm: " + b1.warm);
    }
}