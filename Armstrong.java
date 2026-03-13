//armstrong

class Armstrong{
public static void main(String[] args){
	
int num=153;
int original=num;
int sum=0;
int reminder=0;

while(num!=0)
{
	reminder=num%10;
	sum=sum+(reminder*reminder*reminder);
	  num =num/10;
}
if(sum==original)
{
	
	System.out.println("yes this is armstrong number:"+sum);
}
else{
	
	System.out.println(" its not armstrong number");
}
}
}




