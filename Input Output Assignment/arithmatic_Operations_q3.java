/* Write a program to enter 2 numbers using BufferedReader class and perform basic
arithmetic calculation and print the result.
Input:
20 40
Output:
Addition of 20 and 40 is: 60
Subtraction of 20 and 40 is: -20
Multiplication of 20 and 40 is: 800
Division of 20 and 40 is: 0.5*/
import java.io.*;
class add{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter First Number:");
		int num1= Integer.parseInt(br.readLine());
		
		System.out.println("Enter second Number:");
		int num2= Integer.parseInt(br.readLine());

		System.out.println("Addition of "+num1+" & "+num2+"= "+(num1+num2));
		System.out.println("Subtraction of "+num1+" & "+num2+"= "+(num1-num2));
		System.out.println("Multiplication of "+num1+" & "+num2+"= "+(num1*num2));
		System.out.println("Division of "+num1+" & "+num2+"= "+(num1/num2));

	}
}
