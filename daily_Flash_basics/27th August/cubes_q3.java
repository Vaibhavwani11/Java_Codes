
/*
 Write a program that accepts 2 integers from user and prints addition of their cubes and subtraction of their squares.
 {Note: checks for smaller divisor amongst entered number while computing division}
Input:-
   10 20
Output:- 
   Additioin of  1000 & 8000 is 9000
   Subtraction of 100 & 400 is -300

 */
import java.io.*;
class cube{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter num1 & num2: ");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		int s1=0,s2=0,c1=0,c2=0;

		s1= num1*num1;
		s2=num2*num2;

		c1=num1*num1*num1;
		c2=num2*num2*num2;

		System.out.println("Addition of cubes= "+(c1+c2));
		
		System.out.println("Subtraction of squares= "+(s1- s2));
	}
}
