/*
 Write a program to swap two entered numbers without using third temporary variable
Input: 10 30
Output:
   Before swap: a=10 & b=20
   After swap: a=20 & b=10
 */
import java.io.*;
class swap{

	public static void main(String [] args)throws IOException{

	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);

	System.out.printf("Enter a & b:\n");

	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());

	System.out.printf("Before swap: a=%d b=%d\n& After swap:a=%d  b=%d\n",a,b,b,a);
	
	}
}
