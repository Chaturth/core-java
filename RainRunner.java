class RainRunner {
    public static void main(String... args) {
        Rain r1 = new Rain(0.5, "spherical", 0.8, 2, 5.6);
        Rain r2 = new Rain("spherical", 0.8);
        Rain r3 = new Rain(2, 5.6);
        Rain r4 = new Rain(0.8, 2, 5.6);
        Rain r5 = new Rain("spherical");
        Rain r6 = new Rain();

        System.out.println("Rain r1  size:" + r1.size + " shape:" + r1.shape + " density:" + r1.density + " fallSpeed:" + r1.fallSpeed + " ph:" + r1.ph);
        System.out.println("Rain r2  shape:" + r2.shape + " density:" + r2.density);
        System.out.println("Rain r3  fallSpeed:" + r3.fallSpeed + " ph:" + r3.ph);
        System.out.println("Rain r4  density:" + r4.density + " fallSpeed:" + r4.fallSpeed + " ph:" + r4.ph);
        System.out.println("Rain r5  shape:" + r5.shape);
        System.out.println("Rain r6  default values");

        Umbrella u1 = new Umbrella(500, "black", "nike", 10.5, 8.5);
        Umbrella u2 = new Umbrella(500, "blue");
        Umbrella u3 = new Umbrella("red", "aadi");
        Umbrella u4 = new Umbrella("niko", 10, 8.5);
        Umbrella u5 = new Umbrella(11.7);
        Umbrella u6 = new Umbrella();

        System.out.println("Umbrella u1  cost:" + u1.cost + " color:" + u1.color + " brand:" + u1.brand + " size:" + u1.size + " qualityRating:" + u1.qualityRating);
        System.out.println("Umbrella u2  cost:" + u2.cost + " color:" + u2.color);
        System.out.println("Umbrella u3  color:" + u3.color + " brand:" + u3.brand);
        System.out.println("Umbrella u4  brand:" + u4.brand + " size:" + u4.size + " qualityRating:" + u4.qualityRating);
        System.out.println("Umbrella u5  qualityRating:" + u5.qualityRating);
        System.out.println("Umbrella u6  default values");
		
		
	
        Snow s1 = new Snow(5.0, "white", 0.9, 2, -5.0);
        Snow s2 = new Snow("white", 0.8);
        Snow s3 = new Snow(3, -2.0);
        Snow s4 = new Snow(0.7, 4, -3.0);
        Snow s5 = new Snow("crystal");
        Snow s6 = new Snow();

        System.out.println("Snow s1  thickness:" + s1.thickness + " color:" + s1.color + " density:" + s1.density + " fallSpeed:" + s1.fallSpeed + " temperature:" + s1.temperature);
        System.out.println("Snow s2 color:" + s2.color + " density:" + s2.density);
        System.out.println("Snow s3  fallSpeed:" + s3.fallSpeed + " temperature:" + s3.temperature);
        System.out.println("Snow s4  density:" + s4.density + " fallSpeed:" + s4.fallSpeed + " temperature:" + s4.temperature);
        System.out.println("Snow s5  color:" + s5.color);
        System.out.println("Snow s6  default values");

        HairDryer h1 = new HairDryer(1200, "Philips", "black", 0.8, 2500);
        HairDryer h2 = new HairDryer("Dyson", "silver");
        HairDryer h3 = new HairDryer(1500, 3000);
        HairDryer h4 = new HairDryer("Panasonic", 1.2, 2200);
        HairDryer h5 = new HairDryer(1800);
        HairDryer h6 = new HairDryer();

        System.out.println("HairDryer h1  power:" + h1.power + " brand:" + h1.brand + " color:" + h1.color + " weight:" + h1.weight + " price:" + h1.price);
        System.out.println("HairDryer h2  brand:" + h2.brand + " color:" + h2.color);
        System.out.println("HairDryer h3  power:" + h3.power + " price:" + h3.price);
        System.out.println("HairDryer h4  brand:" + h4.brand + " weight:" + h4.weight + " price:" + h4.price);
        System.out.println("HairDryer h5  price:" + h5.price);
        System.out.println("HairDryer h6  default values");
		
		
        Clip c1 = new Clip("metal", "silver", 2.5, 10, 5.0);
        Clip c2 = new Clip("plastic", "red");
        Clip c3 = new Clip(3.0, 8);
        Clip c4 = new Clip("wood", 2.0);
        Clip c5 = new Clip(12);
        Clip c6 = new Clip();
        System.out.println("Clip c1 -> material:" + c1.material + " color:" + c1.color + " size:" + c1.size + " strength:" + c1.strength + " price:" + c1.price);
        System.out.println("Clip c2 -> material:" + c2.material + " color:" + c2.color);
        System.out.println("Clip c3 -> size:" + c3.size + " strength:" + c3.strength);
        System.out.println("Clip c4 -> material:" + c4.material + " price:" + c4.price);
        System.out.println("Clip c5 -> strength:" + c5.strength);
        System.out.println("Clip c6 -> default values");

       
        ChessBoard cb1 = new ChessBoard(64, "wood", "brown", 12.5, 500);
        ChessBoard cb2 = new ChessBoard("plastic", "black");
        ChessBoard cb3 = new ChessBoard(64, 15.0);
        ChessBoard cb4 = new ChessBoard("glass", 1200);
        ChessBoard cb5 = new ChessBoard(20.0);
        ChessBoard cb6 = new ChessBoard();
        System.out.println("ChessBoard cb1 -> squares:" + cb1.squares + " material:" + cb1.material + " color:" + cb1.color + " size:" + cb1.size + " price:" + cb1.price);
        System.out.println("ChessBoard cb2 -> material:" + cb2.material + " color:" + cb2.color);
        System.out.println("ChessBoard cb3 -> squares:" + cb3.squares + " size:" + cb3.size);
        System.out.println("ChessBoard cb4 -> material:" + cb4.material + " price:" + cb4.price);
        System.out.println("ChessBoard cb5 -> size:" + cb5.size);
        System.out.println("ChessBoard cb6 -> default values");

        
        Track t1 = new Track("athletic", 400.0, "synthetic", 8, 4.5);
        Track t2 = new Track("cycling", "wood");
        Track t3 = new Track(200.0, 6);
        Track t4 = new Track("running", 3.8);
        Track t5 = new Track(10);
        Track t6 = new Track();
        System.out.println("Track t1 -> type:" + t1.type + " length:" + t1.length + " surface:" + t1.surface + " lanes:" + t1.lanes + " rating:" + t1.rating);
        System.out.println("Track t2 -> type:" + t2.type + " surface:" + t2.surface);
        System.out.println("Track t3 -> length:" + t3.length + " lanes:" + t3.lanes);
        System.out.println("Track t4 -> type:" + t4.type + " rating:" + t4.rating);
        System.out.println("Track t5 -> lanes:" + t5.lanes);
        System.out.println("Track t6 -> default values");

        
        Battery b1 = new Battery("Duracell", 3000, 1.5, 0.2, 50);
        Battery b2 = new Battery("Energizer", 2500);
        Battery b3 = new Battery(3.7, 0.5);
        Battery b4 = new Battery("Panasonic", 120);
        Battery b5 = new Battery(4000);
        Battery b6 = new Battery();
        System.out.println("Battery b1 -> brand:" + b1.brand + " capacity:" + b1.capacity + " voltage:" + b1.voltage + " weight:" + b1.weight + " price:" + b1.price);
        System.out.println("Battery b2 -> brand:" + b2.brand + " capacity:" + b2.capacity);
        System.out.println("Battery b3 -> voltage:" + b3.voltage + " weight:" + b3.weight);
        System.out.println("Battery b4 -> brand:" + b4.brand + " price:" + b4.price);
        System.out.println("Battery b5 -> capacity:" + b5.capacity);
        System.out.println("Battery b6 -> default values");

        
        Pawn p1 = new Pawn("white", "plastic", 2.5, 0.1, 10);
        Pawn p2 = new Pawn("black", "wood");
        Pawn p3 = new Pawn(3.0, 0.2);
        Pawn p4 = new Pawn("red", 15);
        Pawn p5 = new Pawn(2.0);
        Pawn p6 = new Pawn();
        System.out.println("Pawn p1 -> color:" + p1.color + " material:" + p1.material + " height:" + p1.height + " weight:" + p1.weight + " price:" + p1.price);
        System.out.println("Pawn p2 -> color:" + p2.color + " material:" + p2.material);
        System.out.println("Pawn p3 -> height:" + p3.height + " weight:" + p3.weight);
        System.out.println("Pawn p4 -> color:" + p4.color + " price:" + p4.price);
        System.out.println("Pawn p5 -> height:" + p5.height);
        System.out.println("Pawn p6 -> default values");

        Carrom ca1 = new Carrom("GSI", "wood", 29.0, 2.0, 1500);
        Carrom ca2 = new Carrom("SYNCO", "plastic");
        Carrom ca3 = new Carrom(30.0, 2.5);
        Carrom ca4 = new Carrom("Champion", 2000);
        Carrom ca5 = new Carrom(3.0);
        Carrom ca6 = new Carrom();
        System.out.println("Carrom ca1 -> brand:" + ca1.brand + " material:" + ca1.material + " size:" + ca1.size + " thickness:" + ca1.thickness + " price:" + ca1.price);
        System.out.println("Carrom ca2 -> brand:" + ca2.brand + " material:" + ca2.material);
        System.out.println("Carrom ca3 -> size:" + ca3.size + " thickness:" + ca3.thickness);
        System.out.println("Carrom ca4 -> brand:" + ca4.brand + " price:" + ca4.price);
        System.out.println("Carrom ca5 -> thickness:" + ca5.thickness);
        System.out.println("Carrom ca6 -> default values");

        
        Strawberry st1 = new Strawberry("red", 0.15, 8.5, "India", 50);
        Strawberry st2 = new Strawberry("pink", 7.0);
        Strawberry st3 = new Strawberry(0.2, 60);
        Strawberry st4 = new Strawberry("USA");
        Strawberry st5 = new Strawberry(9.0);
        Strawberry st6 = new Strawberry();
        System.out.println("Strawberry st1 -> color:" + st1.color + " weight:" + st1.weight + " sweetness:" + st1.sweetness + " origin:" + st1.origin + " price:" + st1.price);
        System.out.println("Strawberry st2 -> color:" + st2.color + " sweetness:" + st2.sweetness);
        System.out.println("Strawberry st3 -> weight:" + st3.weight + " price:" + st3.price);
        System.out.println("Strawberry st4 -> origin:" + st4.origin + " price:" + st4.price);
        System.out.println("Strawberry st5 -> sweetness:" + st5.sweetness);
        System.out.println("Strawberry st6 -> default values");
		
		
    }
}
		
		