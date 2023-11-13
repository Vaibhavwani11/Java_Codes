/*
 Write a program to that accepts integer from user and print sum of all numbers upto that number
Input: 10
Output: The sum of numbers upto 10 is: 55
 */
 import java.io.*;
class sum{
public static void main(String [] args)throws IOEXCEPTION{

	printf("Enter the Number\n");
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	int num=Integer.parseInt(br.readLine());
	
	int sum=0;

	for(int i=0; i<=num; i++){
	
		sum=sum+i;
	}
	System.out.printf("The sum of nuymbers upto %d is:%d\n",num,sum);
}
}
