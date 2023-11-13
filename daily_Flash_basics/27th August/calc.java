/*
 Write a program to simulate simple calculator. Accept two integers from user and sign of operation to perform:
Input: 10 20
       Enter the sign of Operation: +
Output: 
       Addition of 10 & 20 is 30
*/
import java .io.*;
class calc{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter num1 & num2: ");

		int num1= Integer.parseInt(br.readLine());
		int num2= Integer.parseInt(br.readLine());

		System.out.println("Select operator: + , - , / , % ");
		char opr= (char)br.read();

		switch(opr){
			
			case '+': System.out.println("Addition of "+num1+" & "+num2+" is "+(num1+num2));
				  break;
			
			case '-': System.out.println("Subtraction of "+num1+" & "+num2+" is "+(num1-num2));
				  break;
			
			case '*': System.out.println("Multiplication of "+num1+" & "+num2+" is "+(num1*num2));
				  break;
			
			case '/': System.out.println("Division of "+num1+" & "+num2+" is "+(num1/num2));
				  break;

			case '%': System.out.println("Modulus of "+num1+" & "+num2+" is "+(num1%num2));
				  break;
				  
			default: System.out.println("Wrong Choice:");
				  break;
	
		}


	}
}
