/*Program 5: Write a Program that accepts Three integers from user and prints
maximum number from them.
Input: 56 7 99
Output: The Maximum number amongst 56 7 & 99 is 99
*/
import java .io.*;
class max{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter num1,num2 & num3:\n");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int num3=Integer.parseInt(br.readLine());

		if(num1 > num2 && num1>num3)
			System.out.printf("The maximum number amongst %d,%d & %d is %d\n",num1,num2,num3,num1);
		else if(num2 > num3 && num2 >num1)
			System.out.printf("The maximum number amongst %d,%d & %d is %d\n",num1,num2,num3,num2);

		else
			System.out.printf("The maximum number amongst %d,%d & %d is %d\n",num1,num2,num3,num3);
	}
}
