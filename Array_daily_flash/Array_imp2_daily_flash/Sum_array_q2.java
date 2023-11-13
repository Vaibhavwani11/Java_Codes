/*Question 2: Write a java program which takes input from user in array and print the sum of all element.*/
import java.io.*;
class Sum{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int arr[]=new int[5];
		
		int sum=0;

		for(int i=0; i<arr.length; i++){
			
			System.out.print("Enter Number: ");

			arr[i]=Integer.parseInt(br.readLine());
			sum= sum+arr[i];
		}
		System.out.println("Sum= "+sum);
	}	
}
