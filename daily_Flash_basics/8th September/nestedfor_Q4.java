/*
 Write a program to print the following Pattern
 7
 6 5
 5 4 3
 4 3 2 1
 */
class Pattern{

	public static void main(String [] args){
	
		int num=10;
		for(int rows=1; rows<=5; rows++){
		
			for(int cols=1; cols<=rows; cols++){
			
				System.out.printf("%d ",num);
				num--;
			}
		num++;
		System.out.printf("\n");	
		}
	}
}
