class ProductRunner{
	
	public static void main(String[] args)
	{
		
		Product product=new Product(10,"Coocker",1000,10,"Kitchen",0.5);
		
		product.getInfo();
		
		product. calculateDiscountPrice();
		product.addToCart(5);
		
		product.bulkPurchase(5,true);
	}
}

		