/*
 Write a program to print following pattern.
Output: 
 0
 0 0
 0 0 0 
 0 0 0 0 
 */
class Pattern{

	public static void main(String [] args){
	
		for(int rows=1; rows<=4; rows++){
		
			for(int cols=1; cols<=rows; cols++){
			
				System.out.print("0 ");
			}
		System.out.println("");	
		}
	}
}
