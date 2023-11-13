/*
 Print the following pattern
     1
    2 2
   3 3 3
  4 4 4 4 
 5 5 5 5 5
 */
class space{

	public static void main(String [] args){
	
		int num=1;
		for(int rows=1; rows<=5; rows++){
		
			for(int space=4; space>=rows; space--){
			
				System.out.print(" ");
			}
			for(int cols=1; cols<=(2*rows-rows); cols++){
			
				System.out.print(num+" ");
			}
			num++;

		System.out.println();	
		}
	}
}
