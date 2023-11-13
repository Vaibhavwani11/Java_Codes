/*
 Write a java program that accepts two numbers as command line arguements 
 and prints the summation of those two numbers
Input: java demo 5 7
Output: The sum of 5 and 7 are 12
 */
import java.io.*;
class cmd{

	public static void main(String [] javaDemo)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		
		int num1= Integer.parseInt(javaDemo[0]);
		int num2= Integer.parseInt(javaDemo[1]);

		System.out.println(num1+num2);
	}
}
