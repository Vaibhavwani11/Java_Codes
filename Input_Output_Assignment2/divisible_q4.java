/*
Question 5. Write a program to take input of a number and check whether the number is divisible by
both 5 and 10.
Input:
50
Output:
50 is divisible by both 5 and 10    
 */
import java.io.*;
class inp{

	public static void main(String []a)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter the Number:");
		int num=Integer.parseInt(br.readLine());

		if(num%5==0 && num%10==0){
		
			System.out.printf("%d is divisible by both 5 & 10.\b",num);
		}
		else{
		
			System.out.printf("%d is not divisible by 5 & 10\n",num);
		}	
	}
}
