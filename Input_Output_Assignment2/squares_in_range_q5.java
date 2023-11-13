/*Question 4. Write a program to take input of 2 numbers using BufferedReader class as range1 and
range2 and print square and cube of all the numbers between that range.
Input:
Enter range1 : 1
Enter range2 : 5
Output:
Square : 1 4 9 16 25
Cube : 1 8 27 64 125
*/
import java.io.*;
class square{
	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the Starting and Ending number:");
		int range1= Integer.parseInt(br.readLine());
		int range2= Integer.parseInt(br.readLine());
	
		int r1=range1, r2=range2;
		
		System.out.print("Squares:  ");
		for(; range1<=range2; range1++){
		
			System.out.print(range1*range1+" ");
		}
		
		System.out.printf("\nCubes:  ");
		for(; r1<=r2; r1++){
				
			System.out.print(r1*r1*r1+" ");
		}
	}
}
