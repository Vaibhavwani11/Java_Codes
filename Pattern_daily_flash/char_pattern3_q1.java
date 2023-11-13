/*
Write a java code to Print the following Pattern:
C
C G
C G K
C G K O
C G K O S
*/
class nestedFor{

	public static void main(String [] args){
	
		for(int rows=1; rows<=5; rows++){
		
			char ch='C';
			for(int cols=1; cols<=rows; cols++){
			
				System.out.print(ch+" ");
				ch+=4; //ch=ch+3
			}
		System.out.println();	
		}
	}
	

}
