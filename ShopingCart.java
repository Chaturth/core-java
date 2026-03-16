class ShopingCart{
	
	double cartId;
	String customerName;
	String[] items;
	int totalAmount;
	
	ShopingCart(double cartId,String customerName,String items,int totalAmount)
	{
		this.cartId;
		this.customerName=customerName;
		this.items=items;
		this.totalAmount;
	}
	
	void addProductToCart(Product product,int quantity)
	{
		this.product=product;
		this.quantity=quantity;
	}
	
	 void generateBill()
	 {
		 System.out.println("customerName:"+customerName);
		 System.out.println("cartId:"+cartId);
		 
	