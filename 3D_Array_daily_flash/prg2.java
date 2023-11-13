/*
 Write a java program that accepts 3 dimensional Array of planes,rows,columns from user,
 print 3D array in matrix form and print first plane
Input: Enter number of Planes: 2
       Enter number of Rows: 2
       Enter number of columns: 2
		
       Enter elements: 10 20 30 40 50 60 70 80
       Print the first Plane: 10 20 30 40
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
		for(int j=0; j<R; j++){
			
			for(int k=0; k<C; k++){
			
				System.out.print(arr[1][j][k]+" ");
			}
			System.out.println();
		}
	}
}
