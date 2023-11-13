/*
 Write a java program to print the following pattern.
    *  
  * * 
* * *  
 
 */
class Pattern{

	public static void main(String [] args){
	
		for(int rows=1; rows<=3; rows++){
		
			for(int space=3; space>rows; space--){
			
				System.out.print("  ");
			}
			for(int cols=1; cols<=rows; cols++){
			
				System.out.print("* ");
			}
		System.out.println();	
		}
	}
}
