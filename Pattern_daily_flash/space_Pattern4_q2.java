/*
Write a java code to Print the following Pattern:
A B C D
  A B C 
    A B 
      A
*/
class Pattern_code{

	public static void main(String [] args){
	
		for(int rows=1; rows<=5; rows++){
		
			char ch='A';
			for(int space=1; space<rows; space++){
				
				System.out.printf("  ");
			}

			for(int cols=4; cols>=rows; cols--){
			
				System.out.print(ch+" ");
				ch++; 
			}
		System.out.println();	
		}
	}
}
