/*
 Write a program to print series of odd numbers ranging between two numbers entered by user.
Input:	Min of series - 4
	Max of series - 60
Output:
 	Series of odd numbers ranging between 4 & 60 is-
	5 7 9 ...59
 */
import java.io.*;
class odd{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
	
		System.out.printf("Enter Range of series: ");

		int min=Integer.parseInt(br.readLine());
		int max =Integer.parseInt(br.readLine());
		
		System.out.printf("Series of odd numbers ranging from %d to %d",min,max);
		for(; min<=max; min++){
		
			if(min%2!=0)
				System.out.printf("%d, ",min);
		}
	}
}
