/*
 Write a program that takes rupees as input from user and convert them into dollars
  */
import java.io.*;
class rupees{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.printf("Enter Ruppes:\n");
		int rupee=Integer.parseInt(br.readLine());
		int dollar=rupee + 75 ;

		System.out.printf("Dollars=%d\n",dollar);
	}
}
