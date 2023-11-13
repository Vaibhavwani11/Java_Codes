
/*
 Write a program to print following pattern
Output:
  1 2 3 4 
  1 2 3 4 
  1 2 3 4
  1 2 3 4 
 */
class dailyFlash{
public static void main(String [] aargs){

	for(int rows=1; rows<=4;rows++){
	
		for(int cols=1; cols<=4;cols++){
		
			System.out.printf("%d ",cols);
		}
	System.out.printf("\n");	
	}

}
}
