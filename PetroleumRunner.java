public class PetroleumRunner {
    public static void main(String[] args) {
     
        String[] names = new String[5];

       
        PetroleumCompany petrol = new PetroleumCompany(names);

        petrol.save("Indian Oil");
        petrol.save("Bharat Petroleum");
        petrol.save("Hindustan Petroleum");
        petrol.save("Reliance Petroleum");
        petrol.save("Shell");
		
		
		
			
    }
}
