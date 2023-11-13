/*
 write a program to Convert the Hours entered by user into seconds.

input : 1 hr

output : 3600 seconds.
 */
import java.io.*;
class inp{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter hours:\n");

		int hr= Integer.parseInt(br.readLine());
		int sec=hr*3600;

		System.out.printf("%d seconds\n",sec);

	}
}
