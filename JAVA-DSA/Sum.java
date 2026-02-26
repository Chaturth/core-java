class Sum{
	
	public static void main(String... args)
	{
		int[] number={1,2,3,4,5};
		
		int sum=0;
		
		for(int n:number)
		{
			sum=sum+n;
		}
		System.out.println("sum:"+sum);
	}
}