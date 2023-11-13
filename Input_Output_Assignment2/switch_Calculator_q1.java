/*Question 1. Write a program to take 2 numbers n1 and n2 as input from user. Using switch case and
function do the following operations :
1. Addition
2. Subtraction
3. Division
4. Multiplication*/
import java.io.*;
class Switch{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter two Numbers:");

		int num1= Integer.parseInt(br.readLine());
		int num2= Integer.parseInt(br.readLine());
		System.out.println("Enter Operation you want to perform on num1 & num2:");
		char opr= (char)br.read();

		switch(opr){
		
			case '+':	System.out.println(num1+num2);
					break;

			case '-':	System.out.println(num1-num2);
					break;
				
			case '/':	System.out.println(num1/num2);
					break;
			
			case '*':	System.out.println(num1*num2);
					break;		
		}
	}
}
