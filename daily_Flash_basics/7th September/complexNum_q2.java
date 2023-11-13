/*Write a proram that calculates addition of two complex numbers.
Input: 
	Enter Number:1
	Real Part: 5
	Imaginary part: 3

	Enter Number: 2
	Real Part: 2
	Imaginary Part: 1
Output:
	The addition of 5+3i and 2+i is 7+4i
 */
import java.io.*;
class Complex{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.printf("Enter Number=: ");
		int a=Integer.parseInt(br.readLine());
		System.out.printf("Real Part: ");
		int r1=Integer.parseInt(br.readLine());
		
		System.out.printf("Imaginary Part: ");
		int i1=Integer.parseInt(br.readLine());
	
		System.out.printf("Enter Number: ");
		int b=Integer.parseInt(br.readLine());
		System.out.printf("Real Part: ");
		int r2=Integer.parseInt(br.readLine());

		System.out.printf("Imaginary Part: ");
		int i2=Integer.parseInt(br.readLine());


		int radd=(r1+r2);
		int iadd=(i1+i2);
		System.out.printf("The addition=%d+%d'i'\n",radd,iadd);
	}
}
