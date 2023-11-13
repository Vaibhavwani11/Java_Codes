/*Question 2. Write a program in java to take a number as input from user and display all it’s divisors.
Input:
50
Ouput:
1 2 5 10 25*/

import java .io.*;
class divisor{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the Number:");
		int num=Integer.parseInt(br.readLine());

		for(int i=1; i<=num/2; i++){
		
			if(num%i==0){
				
				System.out.printf(i+" ");
			}
		}
	}
}
