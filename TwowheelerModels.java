class TwowheelerModels {
	
	String[] models;
	int currentIndex = 0;	
	
	TwowheelerModels(String[] models)
	{
		this.models = models;
	}
	
	void storeModels(String model)
	{
		int index = models.length;
		
		if(models != null)
		{
			System.out.println("Two wheeler model: " + model);
			System.out.println("Current index: " + currentIndex);
			
			if(currentIndex < index)
			{
				models[currentIndex] = model;
				currentIndex++;
			}
			else
			{
				System.out.println("array is full");
			}
		}
	}
}