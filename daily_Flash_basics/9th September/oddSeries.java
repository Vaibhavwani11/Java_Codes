/*
 Write  a program that prints the series of odd numbers in reverse order from the limiting number entered by user.
Input: 100
Output: 99 97 95 93...1
 */
import java.io.*;
class odd{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the Number:\n");

		int lim=Integer.parseInt(br.readLine());
		for(int i=1; i<=lim; i++){
		
			if((lim-i)%2!=0)
				System.out.printf("%d ",(lim-i));
	
		}
	}
}
