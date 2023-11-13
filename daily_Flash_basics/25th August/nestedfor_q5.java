/*
 Write a program to print following output
  0 0 0 0 
  1 1 1 1
  0 0 0 0
  1 1 1 1 
 */
import java.io.*;
class pattern{
public static void main(String [] args)throws IOException{

	System.out.printf("Enter Number of rows and columns: ");
	
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	
	int lim= Integer.parseInt(br.readLine());
	
	for(int rows=0; rows<=lim; rows++){
	
		for(int cols=0; cols<=lim; cols++){
		
			if(rows%2==0){
				System.out.printf("0 ");
			}
			else{
				System.out.printf("1 ");
			}
		}
	System.out.printf("\n");
	}
	}
}
