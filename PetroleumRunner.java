public class PetroleumRunner {
    public static void main(String[] args) {
     
        String[] names = new String[10];

        PetroleumCompany petrol = new PetroleumCompany(names);

        petrol.save("Indian Oil");
        petrol.save("Bharat Petroleum");
        petrol.save("Hindustan Petroleum");
        petrol.save("Reliance Petroleum");
        petrol.save("Shell");
		petrol.save("GAIL limmited");
		petrol.save("oil and natural gas cooperation");
		petrol.save("oil india limmited");
		petrol.save("mprl limmited");
		petrol.save("cpcl limmited");
		
		boolean found=petrol.search("Indian Oil");
		
		petrol.update(0,"Special Petroleum");
		petrol.update("Shell","Premium Shell");
		
		petrol.delete(2);
		petrol.delete("Reliance Petroleum");
		
    }
}
