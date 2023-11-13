/*
 Write a program that accepts an integer from user and prints its second successor and second predecessor.
Input: 50
Output:
second Predecessor:- 48
second successor:- 52
 */
import java.io.*;
class successor{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter number:\n");
		int num=Integer.parseInt(br.readLine());

		System.out.printf("Second Predecessor=%d\nsecond Successor=%d",num-2,num+2);
	}
}
