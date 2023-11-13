/*
 Write a program to print following Pattern.
 3
 2 3
 1 2 3 
 0 1 2 3
 */
class Pattern{

	public static void main(String [] args){
	
		int num=3;
		for(int rows=1; rows<=4; rows++){
		
			for(int cols=1; cols<=rows; cols++){
			
				System.out.printf("%d ",num);
				num++;
			}
		num=num-(rows+1);	
		System.out.printf("\n");	
		}
	}
}

