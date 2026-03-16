class Product {

    double productId;
    String productName;
    int price;
    double quantiyAvailable;
    String category;
    double discountPercentage;

    Product(double productId, String productName, int price,
            double quantiyAvailable, String category,
            double discountPercentage) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantiyAvailable = quantiyAvailable;
        this.category = category;
        this.discountPercentage = discountPercentage;
    }

    void getInfo() {

        System.out.println("productId: " + productId);
        System.out.println("productName: " + productName);
        System.out.println("price: " + price);
        System.out.println("quantiyAvailable: " + quantiyAvailable);
        System.out.println("category: " + category);
        System.out.println("discountPercentage: " + discountPercentage);
    }

    double calculateDiscountPrice() {

        return price - (price * (discountPercentage / 100));
    }

    double addToCart(int quantity) {

        if (quantity <= quantiyAvailable) {

            quantiyAvailable = quantiyAvailable - quantity;
			
			System.out.println("item addded to cart");

            return calculateDiscountPrice() * quantity;

        } else {

            System.out.println("Out of stock");
            return 0;
        }
    }

    double bulkPurchase(int quantity, boolean isBulkPurchase) {

        if (quantity > 20) {
            System.out.println("Bulk limit exceeded");
            return -2;
        }

        if (isBulkPurchase && quantity >= 10) {

            double priceAfterDiscount = calculateDiscountPrice();
            priceAfterDiscount = priceAfterDiscount * 0.5;

            return priceAfterDiscount * quantity;
			
        }

        else {

            if (quantity <= quantiyAvailable) {
                quantiyAvailable = quantiyAvailable - quantity;
                return calculateDiscountPrice() * quantity;
            }

            else {
                System.out.println("Out of stock");
                return 0;
            }
				
        }
    }
}

		
		
		
	
	
			
		
		