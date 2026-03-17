class KettleRunner {

    public static void main(String[] args)
    {
        String[] names = new String[10];
        Kettle k = new Kettle(names);

        k.save("Electric Kettle");
        k.save("Steel Kettle");
        k.save("Glass Kettle");
        k.save("Travel Kettle");
        k.save("Tea Kettle");
        k.save("Cordless Kettle");
        k.save("Mini Kettle");
        k.save("Smart Kettle");
        k.save("Whistling Kettle");
        k.save("Ceramic Kettle");

        boolean found = k.search("Tea Kettle");
		
		k.update(0,"special electric kettle");
		k.update("Steel Kettle","Electric Kettle");
		
		k.delete(2);
		k.delete("Travel Kettle");

    }
}