/*
 Write a program to print following pattern.
 a
 A A
 a a a 
 A A A A
 a a a a a
 */
class Pattern{

	public static void main(String [] args){
	
		for(int i=5; i>=1; i--){
		
			for(int j=5; j>=i; j--){
			
				if(i%2!=0)
					System.out.printf("a ");
				else
					System.out.printf("A ");
			}
		System.out.printf("\n");	
		}
	}
}
