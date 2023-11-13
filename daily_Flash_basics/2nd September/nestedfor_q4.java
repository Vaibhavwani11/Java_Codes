/*Program 4: Write a Program to Print following Pattern.
1
4 9
16 25 36
49 64 81 100
*/
class Pattern{

	public static void main(String [] args){
	
		int num=1;

		for(int rows=1; rows<=5; rows++){
	
			for(int cols= 1; cols<=rows; cols++){
				
			System.out.printf("%d ",num*num);
			num++;
			
			}
		System.out.printf("\n");
		}
	}
}
