import java.util.*;
class MultiArray{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);	

		int marr[][]= new int[3][3];

		for(int i=0; i<3; i++){
		
			for(int j=0; j<3; j++){

				System.out.print("Enter element:");
				marr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix:");
		for(int i=0; i<3; i++){

			for(int j=0; j<3; j++){
			
				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
