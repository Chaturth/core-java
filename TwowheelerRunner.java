class TwowheelerRunner {

	public static void main(String[] args) {

		String[] models = new String[50];

		TwowheelerModels tw = new TwowheelerModels(models);
		
		tw.storeModels("Activa");
tw.storeModels("Access 125");
tw.storeModels("Jupiter");
tw.storeModels("Pulsar 150");
tw.storeModels("Apache RTR 160");
tw.storeModels("Splendor Plus");
tw.storeModels("HF Deluxe");
tw.storeModels("Passion Pro");
tw.storeModels("Glamour");
tw.storeModels("Shine");
tw.storeModels("Unicorn");
tw.storeModels("Hornet 2.0");
tw.storeModels("FZ");
tw.storeModels("FZ-S");
tw.storeModels("R15");
tw.storeModels("MT-15");
tw.storeModels("Dio");
tw.storeModels("Ntorq 125");
tw.storeModels("Burgman Street");
tw.storeModels("Avenis");
tw.storeModels("Ather 450X");
tw.storeModels("Ola S1");
tw.storeModels("Ola S1 Pro");
tw.storeModels("Chetak");
tw.storeModels("iQube");
tw.storeModels("Hunter 350");
tw.storeModels("Meteor 350");
tw.storeModels("Classic 350");
tw.storeModels("Bullet 350");
tw.storeModels("Dominar 400");
tw.storeModels("Dominar 250");
tw.storeModels("Gixxer");
tw.storeModels("Gixxer SF");
tw.storeModels("Avenger Street");
tw.storeModels("Avenger Cruise");
tw.storeModels("XPulse 200");
tw.storeModels("Xtreme 160R");
tw.storeModels("Karizma");
tw.storeModels("Pulsar NS200");
tw.storeModels("Pulsar N160");
tw.storeModels("Pulsar N250");
tw.storeModels("Apache RTR 200");
tw.storeModels("Ronin");
tw.storeModels("Raider 125");
tw.storeModels("Star City Plus");
tw.storeModels("Scooty Pep Plus");
tw.storeModels("Fascino 125");
tw.storeModels("Ray ZR 125");
tw.storeModels("Pleasure Plus");
tw.storeModels("Maestro Edge");

boolean found=tw.search("Pleasure Plus");
}
}
