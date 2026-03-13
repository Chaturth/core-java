//Program to sort array elements in desc order Program to sort array elements in asc order Program to find an element in array

class Ascending {

    public static void main(String... args) {

        int[] num = {9,8,7,6,5,4,3,2,1};
        int temp = 0;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		
		}
for(int i=0;i<num.length;i++){
			
			System.out.print(num[i]+" ");
}
	}
}

					



