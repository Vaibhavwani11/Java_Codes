/*
 Write a program to print following Pattern:
 7
 7 6
 6 5 4
 4 3 2 1

 */
class Pattern{

	public static void main(String [] arghs){
	
		int x=7;

		for(int i=1; i<=4; i++){
		
			for(int j=1; j<=i; j++){
					
				System.out.printf("%d ",x);
				x--;
			}
		x++;
		System.out.printf("\n");		
		}
	}
}
