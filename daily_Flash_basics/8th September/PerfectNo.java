/*
 Write a program that prints series of Perfect numbers up to the entered limiting number.
{Note: If sum of perfect divisors of number is equal to the entered number then it is called as Perfect number}
Input: 100
Output: The series of all perfect numbers from 1 to 100 is
1,6,28
 */
import java.io.*;
class Perfect{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader (isr);
		
		System.out.printf("Enter the Number:\n");
		int lim=Integer.parseInt(br.readLine());

		for(int i=1; i<=lim; i++){
				
			int sum=0;
			for(int k=1; k<i; k++){
				
				if(i%k==0)
					sum=sum+k;
			}

			if(sum==i){
				System.out.printf("%d ",i);	
			}
		
		}	
	}
}
