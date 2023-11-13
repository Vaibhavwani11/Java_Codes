/*1. Write a program to take a string from the user and only print 5 characters from
it using String Buffer and print the result.
Input :- Enter the String : Core2web
Output:- Result = Core2i*/
import java.io.*;
class stringBuffer{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
				
		StringBuffer sb1=new StringBuffer(br.readLine());
		System.out.println(sb1.substring(0,5));
	}
}
