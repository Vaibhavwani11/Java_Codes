
/*
 Write a program to find maximum betweeen 3 numbers
Input:- 1 4 2
Output:- 4 is max among 1, 4 & 2
 */
class dailyFlash{
public static void main(String [] args){

	int num1=1,num2=4,num3=2;

	if(num1>num2){
	
		if(num2>num3){
		
 		System.out.printf("%d is max among %d,%d & %d",num1,num1,num2,num3);
		}
		else{
					
			System.out.printf("%d is max among %d,%d & %d",num3,num1,num2,num3);
		}
	}
	else{
	
		if(num2>num3){		
			
			System.out.printf("%d is max among %d,%d & %d",num2,num1,num2,num3);
		}
		else{
		
			System.out.printf("%d is max among %d,%d & %d",num3,num1,num2,num3);
		}
	}
}
}
