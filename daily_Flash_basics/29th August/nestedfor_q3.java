
/*
 Write a program to print following pattern:
 *
 * *
 * * *
 * * * * 
 
 */
import java.io.*;
class Pattern{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.print("Enter number of Rows:");
		int lim=Integer.parseInt(br.readLine());

		for(int i=0; i<lim; i++){
		
			for(int cols=0; cols<=i; cols++){
				System.out.printf("* ");			
			}
		System.out.printf("\n");	
		}
	}
}
