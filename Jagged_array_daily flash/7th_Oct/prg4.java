/*
 Write a program that calulates the total number of books read by each person with total number of
 people being 4. Note that number of people represent number of rows and number of books in each column represent book read by
 them during weekdays.
 Given are statistics, initialise the array accordingly and print it. Later print the sum of books
 Person 1: 2 3 4 5
 Person 2: 1 2
 Person 3: 5 8 2 1 2
 Person 4: 1 2 7

Input: 
Output:  2 3 4 5
 	 1 2
	 5 8 2 1 2
	 1 2 7
The number of books read by person 1 is: 14
The number of books read by person 2 is: 3
The number of books read by person 3 is: 18
The number of books read by person 4 is: 10

*/
import java.util.*;
class jaggedArray{

	public static void main(String [] args){
			
		int [][]arr=new int[4][];
		Scanner sc=new Scanner(System.in);

		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[5];
		arr[3]=new int[3];

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
			
			sum=0;
			for(int j=0; j<arr[i].length; j++){
			
				sum=sum+arr[i][j];
			}
			System.out.println("Number of books read by "+i+" is: "+sum);
		}
	}
}
