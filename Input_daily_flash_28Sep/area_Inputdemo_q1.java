/*Write a program to take side of square from user using BufferedReader &
  print area & perimeter of that square. Length of side: 2 Area: 4 Perimeter: 8*/
import java.io.*;
class Area{

	public static void main(String [] args)throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader vv= new BufferedReader(isr);

		System.out.println("Enter Side of a Square: ");
		int side=Integer.parseInt(vv.readLine());

		int area= side*side;
		int peri= 4*side;

		System.out.println("Area= "+area);
		System.out.println("Perimeter= " +peri);
	}
}

