/*Question 1. Write a java program which takes input from user in array and print the array in reverse order*/
import java.util.*;
class Reverse{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[5];
		int revArr[]=new int[5];

		int i=0;

		for(i=0; i<arr.length; i++){
				
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();

			revArr[4-i]=arr[i];
		}

		System.out.println("\nSame Array in reverse Order: ");
		for(i=(arr.length-1); i>=0; i--){
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAnother Array in reverse Order: ");
		for(i=0; i<revArr.length; i++){
			
			System.out.print(revArr[i]+" ");
		}
	}
}
