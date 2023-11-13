/*Program 2: Write a Program that accepts Two integers from user and prints
minimum number from them.
Input: 56 99
Output: The Minimum number amongst 56 & 99 is 56
*/
import java.io.*;
class min{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter Num1 and Num2:\n");
		
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());

		if(num1<num2)
			System.out.printf("The minimum number amongst %d & %d is %d:\n",num1,num2,num1);
		else
			System.out.printf("The minimum number amongst %d & %d is %d:\n",num1,num2,num2);
			


	}
}
