/*
 Write a java program that accepts 3 dimensional Array of planes,rows,columns from user.
 Print even number
Input: Enter number of Planes: 2
       Enter number of Rows: 2
       Enter number of columns: 2
		
       Enter elements: 20,22,35,36,45,67,88,55
       Even numbers are: 20,22,36,88
*/
import java.util.*;
class Array3D{

	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number of Planes: ");
		int P= sc.nextInt();
		
		System.out.println("Enter number of Rows: ");
		int R= sc.nextInt();
		
		System.out.println("Enter number of Cols: ");
		int C= sc.nextInt();

		int arr[][][]= new int[P][R][C];

		for(int i=0; i<P; i++){
			
			for(int j=0; j<R; j++){
			
				for(int k=0; k<C; k++){
				
					System.out.print("Enter element: ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}		
		System.out.println("Even numbers are: ");
		for(int i=0; i<P; i++){
			
			for(int j=0; j<R; j++){
				
				for(int k=0; k<C; k++){
				
					if(arr[i][j][k]%2==0)
						System.out.print(arr[i][j][k]+" ");
				}
			System.out.println();
			}
		}
	}
}
   
