/*
 Write a program to print squares of first 10 numbers.
Output: square of 1: 1
	square of 2: 4
	square of 3: 9
	...
	square of 10: 100
 */
class Squares{
	
	public static void main(String [] args){
	
		for(int i=1; i<=10; i++){
		
			System.out.printf("square of %d: %d\n",i,i*i);
		}
	}
}
