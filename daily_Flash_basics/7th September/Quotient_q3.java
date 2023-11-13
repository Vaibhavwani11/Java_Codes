/*
 Write a program to accept that accepts two integers from user and calculates the quotient and remainder from their division
Input: 10 5
Output: 
 	Quotient=2
	Remainder=0
 */
import java.io.*;
class div{

	public static void main(String [] arhs)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter a & b:\n");

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());

		int quotient=a/b;
		int remainder=a%b;

		System.out.printf("Quotient=%d\tRemainder=%d",quotient,remainder);
		
	}
}

