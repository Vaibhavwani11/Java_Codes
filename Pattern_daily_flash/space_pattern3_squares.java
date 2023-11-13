/*
 Print the following Pattern:
          25
       16 25
     9 16 25
   4 9 16 25
 1 4 9 16 25

 */
class nestedFor{

	public static void main(String [] args){

		for(int rows=1; rows<=5; rows++){
			int num=1;
			for(int space=5; space>rows; space-- ){
			
				System.out.print("  ");
				num++;
			}
	
			for(int cols=1; cols<=rows; cols++){
			
				System.out.print(num*num+" ");
				num++;
			}
		System.out.println();	
		}
	}
}
