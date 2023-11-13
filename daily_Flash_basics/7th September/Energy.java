/*
 Write a program that calculates kinetic energy of object with given Mass & Veocity.
 {Note: K.E=1/2*m*v*v}
Input: Mass=53kg
       Velocity=5m/s
Output:
 	Kinetic Energy=662.5
 */
import java.io.*;
class Energy{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter mass and Velocity:\n");

		int mass=Integer.parseInt(br.readLine());
		int vel=Integer.parseInt(br.readLine());
		
		int ke=1;
		ke=(mass*vel)/2;
		System.out.printf("Kinetic Energy=%d\n",ke);
	}
}
