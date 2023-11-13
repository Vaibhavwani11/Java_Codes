/*
 Write a java program that accepts 2 
 dimensional jagged array from user and print even number in same
Input: 1 2 3
       4 5
       6 7 8 9 10

      Even numbers: 2 4 6 8 10      
 */
import java.util.*;
class jaggedArray{

	public static void main(String [] args){
			
		int [][]arr=new int[3][];
		Scanner sc=new Scanner(System.in);

		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[5];

		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print("Enter element: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				if(arr[i][j]%2==0)
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
