class Descending{
	
	public static void main(String[] args){
		
		int[] number={1,2,3,4,5,6,7,8,9};
		
		int result=0;
		
		for(int i=0;i<number.length;i++)
		{
			for(int j=0;j<number.length-1;j++)
			{
				if(number[j]<number[j+1])
				{
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		for(int i=0;i<number.length;i++)
		{
			System.out.println("descending order:"+number[i]);
		}
	}
}

		