/*
 Write a program that accepts an integer from user and print table of that number
Input: 
4
Output: 4 8 12 16 20 24 28 32 36 40
 */
import java.io.*;
class Table{
	
	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter the Number: ");
		int num=Integer.parseInt(br.readLine());

		for(int i=1; i<=10; i++){
	
			System.out.print(num*i+" ");	
		}
	}
}
