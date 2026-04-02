class DMartStore {

    DMart[] dmarts;
    int currentIndex = 0;

    DMartStore(int size) {
        dmarts = new DMart[size];
    }

    void addProduct(DMart dmart) {

        if (dmart != null) {

            if (currentIndex < dmarts.length) {

                dmarts[currentIndex] = dmart;

                System.out.println("Product is added");
                System.out.println("Product Id: " + dmart.productId);
                System.out.println("Product Name: " + dmart.productName);
                System.out.println("Company Name: " + dmart.companyName);
                System.out.println("MFD: " + dmart.mfDate);
                System.out.println("EXP: " + dmart.expDate);
                System.out.println("Price: " + dmart.price);
                System.out.println("Weight: " + dmart.weight);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full, cannot add more products");
            }

        } else {
            System.out.println("Product is null");
        }
    }
	
	void getProductById(int productId) {

    boolean found = false;

    for (int i = 0; i < currentIndex; i++) {

        if (dmarts[i].productId == productId) {

            System.out.println(" Product Found");
            System.out.println("Product Id: " + dmarts[i].productId);
            System.out.println("Product Name: " + dmarts[i].productName);
            System.out.println("Company Name: " + dmarts[i].companyName);
            System.out.println("MFD: " + dmarts[i].mfDate);
            System.out.println("EXP: " + dmarts[i].expDate);
            System.out.println("Type: " + dmarts[i].type);
            System.out.println("Price: " + dmarts[i].price);
            System.out.println("Weight: " + dmarts[i].weight);

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println(" Product not found with ID: " + productId);
    }
}

   void getPriceByProductName(String productName) {

    boolean found = false;

    for (int i = 0; i < currentIndex; i++) {

        if (dmarts[i].productName.equals(productName)) {

            System.out.println(" Product Found");
            System.out.println("Product Name: " + dmarts[i].productName);
            System.out.println("Price: " + dmarts[i].price);

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println(" Product not found: " );
    }
}
    
void getProductNameByCompanyName(String companyName) {

    boolean found = false;

    for (int i = 0; i < currentIndex; i++) {

        if (dmarts[i].companyName.equals(companyName)) {

            System.out.println(" Product found by company name");
            System.out.println("Product Name: " + dmarts[i].productName);

            found = true;
        }
    }

    if (!found) {
        System.out.println(" Product not found");
    }
}

 void getmfgDateAndExpDateByProductName(String productName) {
	 
	 boolean found = false;
	 
	 for(int i=0;i < currentIndex;i++) {
		 
		 if(dmarts[i].productName.equals(productName)) {
			 
				System.out.println("product mfg date and exp date found by productName");
				System.out.println("product name:"+ dmarts[i].productName);
				System.out.println("mfg date:"+dmarts[i].mfDate);
				System.out.println("mfg date:"+dmarts[i].expDate);
				
				found=true;
		 }
	 }
	 if(!found){
		 System.out.println("product not found");
	 }
 }
 
  void deleteProductByProductName(String productName){
	  
  boolean found = false;
	 
	 for(int i=0;i < currentIndex;i++) {
		 
		 if(dmarts[i].productName.equals(productName)) {
			 
				System.out.println("delete product by product name");
		dmarts[i]=null;
				
				found=true;
		 }
	 }
	 if(!found){
		 System.out.println("product not found");
	 }
 }
			void getProductByproductType(Type type){
				 boolean found = false;
	 
	 for(int i=0;i < currentIndex;i++) {
		 
		 if(dmarts[i].type==type) {
			 
				System.out.println("product found");
				System.out.println("product name:"+ dmarts[i].productName);
			
				
				found=true;
		 }
	 }
	 if(!found){
		 System.out.println("product not found");
	 }

			}			
  
}
