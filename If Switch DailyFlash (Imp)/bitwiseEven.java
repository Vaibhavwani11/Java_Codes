/*
 Write a code in java to check number is even or odd using bitwise Operator and not using Arithmatic Operator
*CodeFormat:-
Write a static method isEven
integer parameter number
return type integer
In Main Method:	Take a hardcoaded number and inside an if statement call the isEven() Method
If method is returning 0 then print even else print odd

 */
class oddEven{

	static int isEven(){
		
		int num=100;

		if((num^1)==num+1){
		
			return 0;
		}
	}
	public static void main(String [] args){
	
		if(isEven==0){
		
			System.out.println("Even");
		}
		else{
		
			System.out.println("Odd");
		}

	}
}
