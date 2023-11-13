/*
 Write a program that accepts 2 integers from user and prints addition and subtraction of them.
Note:Checks for greater number to subtract with while subtrating numbers.
Input:- 
  10 20
Output:- 
  Addition is 30
  Subtraction is 10
 */
import java.io.*;
class subtraction{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter num1 & num2: ");

		int num1= Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		int max=0,min=0;

		System.out.println("Addition is "+(num1+num2));
	
		if(num1>num2){
			max=num1;
			min=num2;
		}
		else{
			max=num2;
			min=num1;
		}
		System.out.println("Subtraction is "+(max-min));
	}
}
