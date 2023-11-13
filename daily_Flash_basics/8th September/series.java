/*
 Write a program that prints the series which increases with the number entered by user.
Input: 15
Output: 1 16 31 46
 */
import java.io.*;
class Series{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the Number: ");
		int num=Integer.parseInt(br.readLine());

		int i=1;
		for(int cnt=0; cnt<15; cnt++){
		
			System.out.printf("%d ",i);
			i+=num;
		}

	}
}

