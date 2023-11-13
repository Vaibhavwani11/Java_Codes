
/*
 Write a program to take all three sides of a triangle from user and check whether the triangle satisfies the pythagoras theorem
Input: 
  side1=3
  side2=4
  Hypotenuse=5
Output:
  Triangle satisfies the pythagoras theorem
 */
import java.io.*;
import java.lang.Math;
class dailyFlash{
public static void main(String [] args) throws IOException{

	InputStreamReader isr =new InputStreamReader(System.in);

	BufferedReader br= new BufferedReader(isr);

	System.out.printf("Enter side1:\n");
  	 int side1= Integer.parseInt(br.readLine());
	System.out.printf("Enter side2:\n");
	 int side2= Integer.parseInt(br.readLine());
	System.out.printf("Enter hypotenuse:\n");
	 int hypotenuse= Integer.parseInt(br.readLine());
	
	
	double hyp= Math.sqrt((side1*side1)+(side2*side2)); 
	if(hypotenuse==hyp){

		System.out.printf("Triangle satisfies the pythagoras theorem\n");
	}

	else {
	
		System.out.printf("Triangle does not satisfy pythagoras theorem\n");
	}
	
	}
}
