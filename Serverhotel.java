class Serverhotel {

    String[] foodItems;
    HotelBrand[] hotelBrands;

    Serverhotel(String[] foodItems, HotelBrand[] hotelBrands) {
        this.foodItems = foodItems;
        this.hotelBrands = hotelBrands;
    }

    void display() {

        if (this.foodItems != null) {
            System.out.println("Length of food items: " + foodItems.length);

            for (String food : foodItems) {
                System.out.println("Food Item: " + food);
            }
        }

        if (this.hotelBrands != null) {
            System.out.println("Length of hotel brands: " + hotelBrands.length);

            for (HotelBrand brand : hotelBrands) {
                System.out.println("Hotel Brand: " + brand.name);
            }
        }
    }
}