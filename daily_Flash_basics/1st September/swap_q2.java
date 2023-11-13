/*
 Write a program which accepts two integers from user swaps their insertion order 
Input: 20 30
Output: 
   Before swap- 20 30
   After swap- 30 20
 */
import java.io.*;
class square{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter two numbers: ");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int temp;

		System.out.printf("Before swap: %d %d\n",num1,num2);
		temp=num1;
		num1=num2;
		num2=temp;

		System.out.printf("After swap: %d %d\n",num1,num2);




	}
}
 
