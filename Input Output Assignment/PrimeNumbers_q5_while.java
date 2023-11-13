
/*Write a program to take input of 2 numbers and print all the prime numbers ranging
between them and print their count.
Note: If there are no numbers to print then print a message that indicates the same.
Input: 0 30

Output: 2 3 5 7 11 13 17 19 23 29
	The count is: 10

Input:	8 10
Output:
	The count is: 0
	No prime numbers to display.
*/
import java.io.*;
class prime{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter first Number:");
		int num1= Integer.parseInt(br.readLine());
		
		System.out.println("Enter second Number:");
		int num2= Integer.parseInt(br.readLine());
		
		while(num1<=num2){
		
			int j=1;
			int cnt=0;
			while(j<=num1){
			
				if(num1%j==0){
					cnt++;
				}
			j++;
			}
		if(cnt==2){
		
			System.out.println(num1+" is a Prime Number.");
		}
		num1++;
		}		

	}
}

