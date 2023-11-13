/*
Write a java code to Print the following Pattern:
 2 
 5 10 
17 26 37
50 65 82 101

here difference between terms is in a.p. 3,5,7,9...
*/
class Pattern{

	public static void main(String [] args){
	
		//System.out.println((10>9>0)); //we cannot use comparative operator like this in java
		int num=1;
		int inc=1;
		for(int rows=1; rows<=5; rows++){
		
			for(int cols=1; cols<=rows; cols++){
				
				num+=inc;
				System.out.print(num+" ");
				inc+=2;				
			}
		System.out.println();	
		}
	}
}
