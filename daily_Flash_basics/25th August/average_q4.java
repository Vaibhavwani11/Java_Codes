/*
 Write a program to accept 10 integers from user and prints the sum and average of entered Numbers
Input:
1 2 3 4 5 6 7 8 9 10 
Output:
Sum=55
Average=5.55;
 */
 import java.io.*;
class avg{
public static void main(String [] args)throws IOException{
int sum=0;
float avg=0;

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	int num= Integer.parseInt(br.readLine());
	
	while( num<=10){
	
		sum=sum+num;
	num++;
	}
	System.out.printf("sum=%d\n",sum);
	avg= sum/10;
	System.out.printf("Average=%.2f\n",avg);
	
}
}
