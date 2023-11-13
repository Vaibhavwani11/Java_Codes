/*
 Write a program to print following Pattern
 1 
 8 27
 64 125 216
 343 512 729 1000
 
 */
class Pattern{

	public static void main(String [] args){
	
		int k=1;
		for(int i=1; i<=4; i++){
		
			for(int j=1; j<=i; j++){
			
				System.out.printf("%d ",k*k*k);
				k++;
			}
		System.out.printf("\n");
		}
	}
}
