/*
 Write a program to print following Pattern
 0
 1 1
 0 0 0
 1 1 1 1 
 0 0 0 0 0
 */
class Pattern{

	public static void main(String [] args){
	
		for(int rows=1; rows<=5; rows++){
		
			for(int cols=1; cols<=rows; cols++){
			
				if(rows % 2==0)
					System.out.printf("1 ");
				else
					System.out.printf("0 ");
			}
		System.out.printf("\n");
		}
	}
}
