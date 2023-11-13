
/*
 Write a program to calculate Simple Interest taking all essential terms to compute as input 
 */
import java.io.*;
class dailyFlash{
public static void main(String [] args) throws IOException{

	InputStreamReader isr= new InputStreamReader(System.in);

	BufferedReader br= new BufferedReader(isr);

	System.out.printf("Enter Principal Amount:\n");
	int prAmount= Integer.parseInt(br.readLine());
		
  	System.out.printf("Enter Interest rate\n");
	int rate= Integer.parseInt(br.readLine());
	
	System.out.printf("Enter Number of years\n");
	int yr=Integer.parseInt(br.readLine());
	  
	int totAmount;
	
	totAmount= prAmount + (prAmount*yr*rate);
	System.out.printf("total Amount=%d",totAmount);
}
}
