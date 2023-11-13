/*
 Print the following Pattern:
 1 2 3 4 5
 3 4 5 6
 5 6 7
 7 8 
 9
 */
class nestedFor{

	public static void main(String [] args){
		
		int num=1,x=3;
		for(int rows=1; rows<=5; rows++){
	
			for(int cols=5; cols>=rows; cols--){
			
				System.out.print(num+" ");
				num++;
			}
		num-=x; //num=num-x
		x--;		
		System.out.println();	
		}
	}
}
