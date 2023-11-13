/*
 Write a program to print following Pattern.
 A A A A A
 B B B B
 C C C
 D D
 E
*/
class Pattern{

	public static void main(String [] arsg){
	
		char x='A';
		for(int i=1; i<=5; i++){
		
			for(int j=5; j>=i; j--){
			
				System.out.printf("%c ",x);
			}
		x++;
		System.out.printf("\n");	
		}
	}
}
