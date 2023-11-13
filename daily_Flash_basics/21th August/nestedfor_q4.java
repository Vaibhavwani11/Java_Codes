/*
 Write a program to print the following pattern
 2 4 6 8
 2 4 6 8
 2 4 6 8
 2 4 6 8
 */
class dailyFlash{

	public static void main(String [] args){
	
		for(int rows=1;rows<=4; rows++){
		
			int num=1;

			for(int cols=1; cols<=4; ){
			
				if(num%2==0){
					System.out.print(num+" ");
					cols++;	
				}

			num++;	
			}

		System.out.println("");	
		}
	}
}
