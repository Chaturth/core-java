class PastaRunner {

    public static void main(String[] args)
    {
        String[] pastas= new String[10];
        Pasta p = new Pasta(pastas);

        p.storePasta("Masala Pasta");
        p.storePasta("Paneer Pasta");
        p.storePasta("Butter Masala Pasta");
        p.storePasta("Tandoori Pasta");
        p.storePasta("Chettinad Pasta");
        p.storePasta("Pav Bhaji Pasta");
        p.storePasta("Palak Pasta");
        p.storePasta("Veg Masala Pasta");
        p.storePasta("Spicy Curry Pasta");
        p.storePasta("Desi Cheese Pasta");

        boolean found = p.search("Paneer Pasta");

    }

}