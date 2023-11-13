/*
 Write a program that prints minimum number between three numbers
Input: 
Output:
*/
import java.io.*;
class min{

	public static void main(String [] arsg)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter three numbers:\n");

		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int num3=Integer.parseInt(br.readLine());

		if(num1<num2 && num1<num3)
			System.out.printf("%d is minimum\n",num1);
		
		else if(num2<num1 && num2<num3)
			System.out.printf("%d is minimum\n",num2);
		
		else
			System.out.printf("%d is minimum\n",num3);

	}
}

