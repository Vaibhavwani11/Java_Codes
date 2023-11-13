/*
 Write a java program for 2 dimensional jagged array from the user and print the same.
 */
import java.util.*;
class jaggedDemo{

	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		
		int rows;
		System.out.print("Enter Number of rows: ");
		rows=sc.nextInt();

		int arr[][]=new int [rows][];

		int c1=0;
		int c2=0;
		int c3=0;

		System.out.println("Enter number of columns for row 1:");
		c1=sc.nextInt();
		arr[0]= new int[c1];
		
		System.out.println("Enter number of columns for row 2:");
		c2=sc.nextInt();
		arr[1]= new int[c2];
			
		System.out.println("Enter number of columns for row 3:");
		c3=sc.nextInt();
		arr[2]= new int[c3];

		for(int i=0; i<rows; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print("Enter element: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<rows; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
