class Search{
	public static void main(String[] args){
	int[] numbers={6,4,3,7,9,8};
	
	int search=3;
	
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]==search)
		{
			System.out.println("number found in array:"+numbers[i]);
		}
	}
}
}
