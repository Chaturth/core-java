class TurbineRunner {

    public static void main(String[] args)
    {
        String[] names = new String[10];
        Turbine t = new Turbine(names);

        t.save("Steam Turbine");
        t.save("Gas Turbine");
        t.save("Water Turbine");
        t.save("Wind Turbine");
        t.save("Hydraulic Turbine");
        t.save("Impulse Turbine");
        t.save("Reaction Turbine");
        t.save("Pelton Turbine");
        t.save("Francis Turbine");
        t.save("Kaplan Turbine");
		
		

        boolean found = t.search("Wind Turbine");
		
		t.update(0," SPECIAL TURBINE");
		
		t.update("Gas Turbine","Steam turbine");
		
		t.delete(2);
         t.delete("Wind Turbine");
		

    }
}