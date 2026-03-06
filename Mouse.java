//Declare below classes, then declare 5 primitive/String instance variables and 5 non primitive(not string) Total 66 classes and one runner Create one instance of below classes and init/instanit..te all variables using constructor. Mouse File Lion Motor Coach Ipl Spa Tea Bell Cloud Aquarium


class Mouse {
    String companyName;
    float weight;
    int size;
    boolean isWireless;
    String qualityLevel;

    Brand brand;
    Quality quality;
    Warranty warranty;
    Price price;
    Mousepad mousepad;

    Mouse(String companyName, float weight, int size, boolean isWireless, String qualityLevel,
          Brand brand, Quality quality, Warranty warranty, Price price, Mousepad mousepad) {
        this.companyName = companyName;
        this.weight = weight;
        this.size = size;
        this.isWireless = isWireless;
        this.qualityLevel = qualityLevel;
        this.brand = brand;
        this.quality= quality;
        this.warranty = warranty;
        this.price = price;
        this.mousepad = mousepad;
		  }
		  
		  
		  void getInfo()
		  {
			  System.out.println(" name of the company:"+companyName);
			    System.out.println(" weight:"+weight);
				  System.out.println(" size:"+size);
				    System.out.println(" isWireless"+isWireless);
					  System.out.println(" qualityLevel:"+qualityLevel);
					  
					  if(brand!=null)
					  {
						  this.brand.getInfo();
					  }
					  
					   if(quality!=null)
					  {
						 	  this.quality.getInfo();
					  }
					  
					   if(warranty!=null)
					  {
						  	  this.warranty.getInfo();
					  }
					  
					   if(price!=null)
					  {
							  this.price.getInfo();
					  }
					  
					   if(mousepad!=null)
					  {
							  this.mousepad.getInfo();
					  }
					  
					  
					  
					  
					  
					  
		  }
		  
		  
		
	
		
    
}

