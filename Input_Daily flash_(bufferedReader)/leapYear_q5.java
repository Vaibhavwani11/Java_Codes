/*
 Write a java program that takes any year as input from user and prints whether the year 
 is leap year or not.
Input: 2017
Output: 2017 is not a leap year. 
 */
import java.io.*;
class inp{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int year= Integer.parseInt(br.readLine());
		
		if(year%4==0)
			System.out.println(year+ " is a Leap year.");	

		else
			system.out.println(year+ " is not a Leap year.");
	}
}
