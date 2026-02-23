class ControlStatement1{
	
	public static void main(String args[]){
		
		
		boolean iscallable=true;
		boolean isInnerFunctioncallable=false;
		if(iscallable){
			run(isInnerFunctioncallable);
		}
		
	}
	static void run(boolean isInnerFunctioncallable){
		
		int days=3;
		int dayNum=7;
		int num=4;
		String day="monday";
		if(isInnerFunctioncallable){
			anotherRun(days,dayNum);
		}
		else{
			defaultRun(num,day);
		}
		
		
		
	}
	static void anotherRun(int days,int dayNum){
		
		System.out.println("another function called..");
		do{
			System.out.println(days+" left for bday");
			days--;
		}
		while(days>0);
			System.out.println("happy birthday");
		
		switch(dayNum){
			case 1:
			System.out.println("its Sunday");
			break;
			case 2:
			System.out.println("its Monday");
			break;
			case 3:
			System.out.println("its Tuesday");
			break;
			case 4:
			System.out.println("its Wednesday");
			break;
			case 5:
			System.out.println("its Thursday");
			break;
			case 6:
			System.out.println("its Friday");
			break;
			case 7:
			System.out.println("its Saturday");
			break;
			default:
			System.out.println("invalid number of day");
			
		}
		
		
	}
	static void defaultRun(int num,String day){
		
		
		System.out.println("default function called..");
		while(num>=0){
			System.out.println(num);
			num--;
		}
		if(day=="sunday"){
			System.out.println("day no is 1");
		}
		else if(day=="monday"){
			System.out.println("day no is 2");
		}
		else if(day=="tuesday"){
			System.out.println("day no is 3");
		}
		else if(day=="wednesday"){
			System.out.println("day no is 4");
		}
		else if(day=="thursday"){
			System.out.println("day no is 5");
		}
		else if(day=="friday"){
			System.out.println("day no is 6");
		}
		else if(day=="saturday"){
			System.out.println("day no is 7");
		}
		else{
			System.out.println("invalid day ");
		}
		
	}
	
}