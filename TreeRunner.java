class TreeRunner{

    public static void main(String[] args)
    {
        String[] names = new String[10];
        Tree t = new Tree(names);

        t.save("Neem");
        t.save("Banyan");
        t.save("Mango");
        t.save("Peepal");
        t.save("Coconut");
        t.save("Teak");
        t.save("Sandalwood");
        t.save("Ashoka");
        t.save("Jackfruit");
        t.save("Guava");

        boolean found = t.search("Mango");

        t.update(0, "Special Tree");
        t.update("Mango", "Golden Mango");

        t.delete(2);
        t.delete("Peepal");

    }

}