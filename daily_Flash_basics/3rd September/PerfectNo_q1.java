/*
 Write a program which detects whether the entered number is perfect or not.
 {Note: If sum of perfect divisors of number is equal to the entered number then it is called as Perfect number}
Input:- 6
Output:- 6 is a Perfect number 
 */
import java.io.*;
class perfect{

	public static void main(String [] args)throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the Number:\n");

		int num= Integer.parseInt(br.readLine());
		int sum=0;

		for(int i=1; i<=num/2; i++){
		
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum==num)
			System.out.printf("%d is a Perfect Number\n",num);	
		else
			System.out.printf("%d is not a Perfect Number\n",num);
	}
}
