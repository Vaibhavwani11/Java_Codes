
/*
 Print the following Pattern:
  1  2  3  4  5
  4  6  8 10
  9 12 15
 16 20
 25
 */
class nestedFor{

	public static void main(String [] args){
	
		for(int rows=1; rows<=5; rows++){
			
			int num=rows*rows;

			for(int cols=5; cols>=rows; cols--){
			
				System.out.printf("%2d ",num);
				num+=rows;
			}	
		System.out.println();	
		}
	}

}
