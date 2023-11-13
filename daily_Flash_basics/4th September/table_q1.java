/*
 Write a program ti print table in Reverese order.
Input: 2
Output: 2*10=20
	2*9=18
	2*8=16
	.
	.
	2*1=2
*/
import java.io.*;
class Table{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		int num=Integer.parseInt(br.readLine());

		for(int i=10; i>=1; i--){
		
			System.out.printf("%d*%d=%d\n",num,i,num*i);
		}
	}
}
