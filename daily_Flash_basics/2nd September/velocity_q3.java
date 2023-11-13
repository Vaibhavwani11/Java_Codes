/*Program 3: Write a Program to calculate Velocity of particle in the space having
Distance & Time Entered By User.
Input:
Distance: 100m
Time: 20sec
Output: The Velocity of a Particle roaming In space is 5m/s.
*/
import java.io.*;
class velocity{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter Distance and Time:\n");

		int distance= Integer.parseInt(br.readLine());
		int time= Integer.parseInt(br.readLine());

		int velocity;
		velocity= distance/time;
		System.out.printf("The velocity of particle is %dm/s\n",velocity);
	}
}
