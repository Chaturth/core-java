class CylinderGasRunner{
	
	public static void main(String[] args)
	{
		String[] names = new String[10];
		CylinderGas c= new CylinderGas(names);
		
		c.save("Indane Gas");
        c.save("Bharat Gas");
        c.save("HP Gas");
        c.save("Reliance Gas");
        c.save("Nayara Energy Gas");
        c.save("Super Gas");
        c.save("Total Gas");
        c.save("GoGas");
        c.save("Flame Gas");
        c.save("Aegis Gas");

		boolean found=c.search("GoGas");
		
		c.update(0,"Special Gas");
		c.update("GoGas","Premium Gas");
		
		c.delete(2);
		c.delete("Reliance Gas");
		
	}
	
}
	
	