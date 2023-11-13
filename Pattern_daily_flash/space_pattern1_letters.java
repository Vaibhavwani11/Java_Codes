
/*
 Print the following Pattern:
 	 A
       B C
     C D E
   D E F G
 E F G H I
 */
class nestedFor{

	public static void main(String [] args){
	
		char ch='A';
		for(int rows=1; rows<=5; rows++){
		
			for(int space=4; space>=rows; space--){
			
				System.out.print("  ");
			}
			for(int cols=1; cols<=rows; cols++){
			
				System.out.print(ch+" ");
				ch++;
			}
		System.out.println();	
		}
	}
}
