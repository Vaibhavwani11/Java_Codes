/*
 Write a program that accepts two integers from user and prints the series of factorials of all numbers between those two inputs.
Input: 1 to 5
Output: 
	Factorial of 1=1
	.
	.
	.
	Factorial of 5=120
 */
import java.io.*;
class fact{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the range:\n");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		for(; num1<=num2; num1++){
		
			double fact=1;
			for(int i=1; i<=num1; i++){
			
				fact= fact*i;
			}

			
		System.out.printf("Factorial of %d=%.0f\n",num1,fact);	
		}


	}
}

