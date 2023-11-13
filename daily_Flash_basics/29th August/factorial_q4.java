/*
 Write a C program to calculate Factorial of a given Number.
Input: 5
Output: The factorial of 5 is 120
 */
import java.io.*;
class Fact{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter the Number: ");
		int num= Integer.parseInt(br.readLine());
		double fact=1;

		for(int i=1; i<=num; i++){
		
			fact= fact*i;
		} 
	System.out.printf("Factorial of number= %1f\n",fact);	
	}
}
