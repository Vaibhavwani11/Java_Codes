/*
 Write a program that accepts integer from user and prints maximum number from them.
Input: 56 99
Output: 99 is maximum amongst 56 & 99
 */
import java.io.*;
class max{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter two numbers: ");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		if(num1>num2)
			System.out.printf("%d is maximum amongst %d & %d\n",num1,num1,num2);
		else
			System.out.printf("%d is maximum amongst %d & %d\n",num2,num1,num2);

	}
}
