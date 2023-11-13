
/*
 Write a program to print squares and cubes of all even numbers ranges between given Input number.
Input: 10
	
Output:
	Square of 2:4 & cube of 2: 8
	Square of 3:9 & cube of 3:9
	.
	.
	Square of 10:100 & cube of 10:1000
*/
import java.io.*;
class square{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
	
		System.out.printf("Enter the number: ");

		int num=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++){
		
			if(i%2==0)
				System.out.printf("Square of %d: %d & cube of %d: %d\n",i,i*i,i,i*i*i);


		}
	}
}
