/*Write a program to take input from user for all datatypes (int, float, double, long,
boolean, char and String) using BufferedReader class and print the same.*/

import java.io.*;
class inpDemo{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter an Integer:");
		int Num=Integer.parseInt(br.readLine());
	 	
		System.out.println("Enter Float: ");
		float f=Float.parseFloat(br.readLine());

		System.out.println("Enter Double: ");
		double d= Double.parseDouble(br.readLine());

		System.out.println("Enter Boolean: ");
		boolean b= Boolean.parseBoolean(br.readLine());
		
		System.out.println("Enter Long: ");
		long l=Long.parseLong(br.readLine());

		System.out.println("Enter the Character:");
		char ch=(char)br.read();
		
	br.skip(1); 	//To skip the '\n' {bcz char accepts only 1 element so '\n' is Passed to String}

		System.out.println("Enter the String:");
		String str = br.readLine();
		
		System.out.println("Int= "+Num);
		System.out.println("Float= "+f);
		System.out.println("Double= "+d);
		System.out.println("Boolean= "+b);
	 	System.out.println("Long= "+l);
		System.out.println("char= "+ch);
		System.out.println("String= "+str);	
	
	}

}
