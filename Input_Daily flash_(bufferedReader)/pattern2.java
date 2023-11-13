
/*
 Write a java program to print the following pattern.
* * * 
  * * 
    *   
 
 */
class pattern{

	public static void main(String [] args){
	
		for(int rows=1; rows<=3; rows++){
		
			for(int space=1; space<rows; space++){
				
				System.out.print("  ");
			}
			for(int cols=3; cols>=rows; cols--){
			
				System.out.print("* ");
			}
		System.out.println();	
		}
	}
}

