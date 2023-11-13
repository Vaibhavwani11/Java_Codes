/*
Write a java program that accepts 3 inputs from user and prints the largest number amongst them.
Input: 2 8 5
Output: 8 is largest number amongst 2 and 5
 */
import java.io.*;
class inp{

	public static void main(String []args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter three Numbers:");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int num3=Integer.parseInt(br.readLine());

		if(num1>num2){
			if(num2>num3)
				System.out.println(num1+ " is the largest number.");
			else
				System.out.println(num3+ " is the largest number.");	
		}
		else{
			if(num2>num3)
				System.out.println(num2+ " is the largest number.");
			else
				System.out.println(num3+ " is the largest number.");
		}
	}
}
