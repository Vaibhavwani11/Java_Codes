/*
 Write a program to print following series

	 A z B y C x D w E v F u G t
 */
class characters{

	public static void main(String [] args){
	
		for(int i=0; i<7; i++){
		
			System.out.printf("%c  %c  ",'A'+ i, 'z'-i);
		}
	}
}

