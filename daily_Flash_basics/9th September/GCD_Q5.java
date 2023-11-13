/*
 write a program that calculates the Greatest Common Divisor of two entered numbers.

input : 25 15

output: The GCD of 25 & 15 is 5.
 */
import java.io.*;
class GCD{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter num1 & num2: ");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
			
		int i=1,gcd=0;

		while(i<=num1/2){
		
			if(num1%i==0 && num2%i==0){
				if(i>gcd)
					gcd=i;
			}
		i++;
		}
		System.out.printf("GCD=%d ",gcd);

	}
}
