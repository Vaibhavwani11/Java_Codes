/*
 Write a program to print cubes and squares of all odd numbers ranges between given input number
Input: 
  10
Output:
	Cube of 1: 1 and Square of 1: 1
	Cube of 3: 27 and Square of 3: 9
	.
	.
	Cube of 9: 729 and Square of 9: 81

 */
import java.io.*;
class cube{

	public static void main(String [] args)throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter the Number:\n");
		int lim= Integer.parseInt(br.readLine());

		for(int i=1; i<=lim; i++){
		
			if(i%2!=0){
			
				System.out.printf("Cube of %d: %d and Square of %d: %d\n",i,i*i*i,i,i*i);
			}
		}


	}
}
