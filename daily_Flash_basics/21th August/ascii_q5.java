/*
 Write a program to print ASCII values of Input character:
Input : A
Output: ASCII value of A is 65
 */
import java.io.*;
class dailyFlash{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter the Character");
		int ch=(char)br.read();
		System.out.printf("ASCII value of %c=%d\n",ch);

	}
}
