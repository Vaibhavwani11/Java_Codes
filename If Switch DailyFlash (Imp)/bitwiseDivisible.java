
/*
 Write a code in java to check divisiblity of a number by 2 using bitwise Operator and not using Arithmatic Operator
*CodeFormat:-
Write a static method isDivisible
integer parameters dividend and divisor
return type: boolean
In Main Method:	Take two integer variables dividend and divisor (divisor should be 2 as we are chcking divisiblity by 2)
call the isDivisible() Method from if statement and
print yes if the method returns true else print no if method returns false

 */
class divisiblity{

	static boolean isDivisible(int divident, int divisor){
	
		int val;
		
		val= divident & 1;

		if(val==0){
		
			return true; 
		}
		else{
		
			return false;
		}
	}
	public static void main(String [] args){
	
		int divident=8,divisor=2;

		if(isDivisible(divident,divisor)==true){
		
			System.out.println("Yes");
		}
		else{
		
			System.out.println("No");
		}
	}
}

