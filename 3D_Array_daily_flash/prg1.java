/*
 Write a java program that accepts 3 dimensional Array of planes,rows,columns and print
 Sum of all elements from user and add all the elements 
Input: Enter number of Planes: 2
       Enter number of Rows: 2
       Enter number of columns: 2
		
       Enter elements: 1 2 3 4 5 6 7 8
       Sum=36
       
*/
import java.io.*;
class _3Darray{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int [][][]arr= new int[2][2][2];

		for(int i=0; i<2; i++){
		
			for(int j=0; j<2; j++){
			
				for(int k=0; k<2; k++){
				
					System.out.print("Enter element:");
					arr[i][j][k]=Integer.parseInt(br.readLine());
					
				}
			}
		}
		int sum=0;

		for(int i=0; i<2; i++){
		
			System.out.println("Plane "+i);
			for(int j=0; j<2; j++){
			
				for(int k=0; k<2; k++){
				
					System.out.print(arr[i][j][k]+" ");
					sum+=arr[i][j][k];
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Sum= "+sum);

	}
}
