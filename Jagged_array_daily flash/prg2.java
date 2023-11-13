/*
 Write a program to demonstrate 2D jagged array such that 
 first row has one element 
 second row has 2 elements and so on.
 (All 3 ways taught in lecture)
 */
import java.util.*;
class jaggedArray{

	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);

		int arr[][]={{1},{2,3},{3,4,5}};	

		System.out.println("Jagged array 1");
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int [][]xarr= new int[3][];
		
		xarr[0]= new int[]{1};
		xarr[1]= new int[]{1,2};
		xarr[2]= new int[]{3,4,5};

		System.out.println("Jagged array 2");
		for(int i=0; i<xarr.length; i++){
		
			for(int j=0; j<xarr[i].length; j++){
			
				System.out.print(xarr[i][j]+" ");
			}
			System.out.println();
		}
			
		int yarr[][]= new int[3][];
	
		yarr[0]= new int[2];
		yarr[1]= new int[4];
		yarr[2]= new int[2];		
		
		for(int i=0; i<yarr.length; i++){
		
			for(int j=0; j<yarr[i].length; j++){
			
				System.out.print("Enter element: ");
				yarr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Jagged array 3");
		for(int i=0; i<yarr.length; i++){
		
			for(int j=0; j<yarr[i].length; j++){
			
				System.out.print(yarr[i][j]+" ");
			}
			System.out.println();
		}
	}


}
