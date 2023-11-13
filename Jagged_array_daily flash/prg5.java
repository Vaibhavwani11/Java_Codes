
/*
 Write a java program that accepts 2 dimensional jagged array from user 
 and print sum of numbers divisible by 5.
Input: 1 2 3 4 5 6 7 8 9 10 
Sum=15
 */
import java.util.*;
class jaggedArray{

	public static void main(String [] args){
	
		int [][]arr=new int[3][];
		Scanner sc=new Scanner(System.in);

		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[4];

		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print("Enter element: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
			
				if(arr[i][j]%5==0)
					sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum is: "+sum);

	}
}

	

