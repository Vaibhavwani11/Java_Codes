/*
 Write a program to implement Ohms Law.
 {Note: V= I*R where  v,is voltage  & R is resistance}

Input: I=10amp
       R=5
Output:
	V=50
 */
import java.io.*;
class ohm{
	
	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter I and R:\n");

		float I=Float.parseFloat(br.readLine());
		float R=Float.parseFloat(br.readLine());

		float V;
		V= I*R;
		System.out.printf("V=%.2f\n",V);
	}
}
