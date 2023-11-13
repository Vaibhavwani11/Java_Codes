/*
 Write a program to take input length and breadth of rectangle and calculate its area.
Input: 10  20 
Output: Area of rectangle=200
 */
import java.io.*;
class area{

	public static void main(String [] arsg)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.printf("Enter Length and Breadth of Rectangle:\n");
			
		int length=Integer.parseInt(br.readLine());
		int breadth=Integer.parseInt(br.readLine());

		int area;
		area=length*breadth;

		System.out.printf("Area of Rectangle=%d\n",area);

	}
}
