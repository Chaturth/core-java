class SumEvenOdd{
	
	public static void main(String[] args)
	{
		
		int[] number={2,3,4,5,6,7,8,9};
		int even=0;
		int odd=0;
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
				
			{
				even++;
				
			}
			
			if(number[i]%2!=0)
			{
				odd++;
				
			}
		}
		System.out.println("count of even numbers:"+even);
		System.out.println("count of odd numbers:"+odd);
	}
}

