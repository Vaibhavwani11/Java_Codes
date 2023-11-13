
/*
 Write a program to print following pattern:
 1
 2 3
 4 5 6 
 7 8 9 10 
 */
import java.io.*;
class Pattern{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.print("Enter number of Rows:");
		int lim=Integer.parseInt(br.readLine());

		int cnt=1;
		for(int i=0; i<lim; i++){
		
			for(int cols=0; cols<=i; cols++){
				System.out.printf("%d ",cnt);
			
				cnt++;			
			}
		System.out.printf("\n");	
		}
	}
}
