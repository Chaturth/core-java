//Painter,Carpenter,Server,Joker,Scanner,Broker,Hammer,Jamoon,Banner,CarrotHalwa,Tower Total : 52 instances

class Painter {

    String[] paintingStyles;
    PaintBrand[] paintBrands;

    Painter(String[] paintingStyles, PaintBrand[] paintBrands) {
        this.paintingStyles = paintingStyles;
        this.paintBrands = paintBrands;
    }

    void display() {

        if (this.paintingStyles != null) {
            System.out.println("Length of painting styles: " + paintingStyles.length);

            for (String style : paintingStyles) {
                System.out.println("Painting Style: " + style);
            }
        }

        if (this.paintBrands != null) {
            System.out.println("Length of paint brands: " + paintBrands.length);

            for (PaintBrand brand : paintBrands) {
                System.out.println("Paint Brand: " + brand.name);
            }
        }
    }
}
	
