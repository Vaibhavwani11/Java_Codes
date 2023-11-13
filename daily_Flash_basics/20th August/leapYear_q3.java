
/*
 Write a program to check if a year is leap year or not {
Note: If a year is divisible by 4 then it is leap year but if the year is century year like 
	1900,2000,2100 then it must be divisible by 400 }
 */
import java.io.*;
import java.lang.*;
class dailyFlash{
public static void main(String [] args)throws IOException{

	InputStreamReader isr= new InputStreamReader(System.in);

	BufferedReader br= new BufferedReader(isr);

	System.out.printf("Enter year:\n");
	int year= Integer.parseInt(br.readLine());

	if(year%400==0 || year%4==0){
	
		System.out.printf("Year %d is a leap year\n",year);
	}
	else{
	
		System.out.printf("Year %d is not leap year\n",year);
	}
}
}
