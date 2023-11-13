/*
 Write a program that accepts the input from user and print whether the number is odd or even.
 Write a program that accepts the input from user and print whether the number is odd or even.
Input: 2
Output: 2  is Even number
 */
import java.io.*;
class odddeven{
public static void main(String [] args)throws IOException{

	System.out.printf("Enter the Number:\n");

	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	
	int num= Integer.parseInt(br.readLine());

	if(num%2==0){
	
		System.out.printf("%d is Even number\n",num);
	}
	else{
	
		System.out.printf("%d  is an Odd number\n",num);
	}
}
}
