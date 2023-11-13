/*
 Write a program that accepts an Integer from user and prints all of its Perfect divisors
Input: 24
Output: 
	Perfect divisors of 24 are 2 3 4 6 8 12
 */
import java.io.*;
class divisors{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the Number:\n");
		int num= Integer.parseInt(br.readLine());
		int i=1;

		while(i<num){
			
			if(num%i==0)
				System.out.printf("%d ",i);
		i++;	
		}
	}
}
