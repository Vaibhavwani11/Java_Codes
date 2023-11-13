/*
 Write a program that takes electricity unit charges as input and calculate total electricity bill according to the given condition:
 For first 50 units, Rs. 0.50/unit
 For next 100 units, Rs. 0.75/unit
 For next 100 units, Rs. 1.20/unit
 For unit above 250, Rs. 1.50/unit
 */
import java.io.*;
class dailyFlash{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter Units consumed:");
		int unit= Integer.parseInt(br.readLine());
		
		if(unit<=50)
			System.out.println(unit*0.50);

		else if(unit>50 && unit<=150)
			System.out.println(unit*0.75);
		
		else if(unit>150 && unit<=250)
			System.out.println(unit*1.20);
		
		else if(unit>250)
			System.out.println(unit*1.50);
	}

}
