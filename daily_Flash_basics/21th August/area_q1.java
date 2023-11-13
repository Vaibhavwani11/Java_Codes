/*
 * write a program to calculate area of circle. 
 */
import java.io.*;
class dailyFlash{

public static void main(String [] args)throws IOException{

	InputStreamReader isr= new InputStreamReader(System.in);

	BufferedReader br= new BufferedReader(isr);

	System.out.println("Enter the Radius:");
	int radii= Integer.parseInt(br.readLine());

	System.out.println("Area of Circle="+3.14*radii*radii);


}	
}
