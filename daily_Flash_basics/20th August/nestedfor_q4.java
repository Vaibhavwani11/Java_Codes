
/*
 Write a program to print following pattern:
 1 2 3 4
 5 6 7 8
 9 10 11 12
 13 14 15 16
 */
class dailyFlash{
public static void main(String [] args){

	int num=1;

	for(int rows=1; rows<=4; rows++){
	
		for(int cols=1; cols<=4; cols++){
		
			System.out.printf("%d ",num);
			num++;	
		}
	System.out.printf("\n");	
	}
}
}
