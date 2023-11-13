/*
 Write a program that accepts 2 integers from user and prints multiplication and division of them.
 {Note: checks for smaller divisor amongst entered number while computing division}
Input:-
   10 20
Output:- 
   Multiplication is 200
   Division is 2
 */
import java.io.*;
class div{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter num1 & num2: ");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		int max=0,min=0;

		System.out.println("Multiplication is "+(num1*num2));
		if(num1>num2){
			max=num1;
			min=num2;
		}
		else{
			max=num2;
			min=num1;
		}
		System.out.println("Division is "+(max/min));
	}
}
