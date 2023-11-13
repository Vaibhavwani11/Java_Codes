import java.util.*;
class MultiArray{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter Number of Rows:");
		int rows=sc.nextInt();
		
		System.out.println("Enter Number of Columns:");
		int cols=sc.nextInt();

		char marr[][]= new char[rows][cols];

		for(int i=0; i<rows; i++){
		
			for(int j=0; j<cols; j++){

				System.out.print("Enter element:");
				marr[i][j]=sc.next().charAt(0);
			}
		}
		
		System.out.println("Matrix:");
		for(int i=0; i<rows; i++){

			for(int j=0; j<cols; j++){
			
				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
