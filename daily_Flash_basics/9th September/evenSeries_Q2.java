/*
 Write a program that prints series of even numbers in reverse order from entered number.
Input: 100
Output: 100 98 96 94 92 90...1
 */
import java.io.*;
class even{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the number: ");

		int lim=Integer.parseInt(br.readLine());
		for( ; lim>=1; lim--){
		
			if(lim%2==0)
				System.out.printf("%d ",lim);
		}
	}
}
