/*To take multiple inputs on one line
Input:
	5 shashi 1000
	6 vaibhav 900

Output: Emp_ID=5
	Emp_name=shashi
	Emp_Sal=1000
	
	Emp_ID=6
	Emp_name=vaibhav
	Emp_Sal=900
*/
import java.util.*;
import java.io.*;
class stringTokenizeDemo{

	public static void main(String[] a)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String empDetails= br.readLine();
		//By default BufferedReader accepts String upto Enter,bt we can change it using StringTokenizer
		//In scanner String is accpeted upto space by deafault
		StringTokenizer st= new StringTokenizer(empDetails," ");//delimiter is " "{space} here
		
		String token1= st.nextToken();
		String token2= st.nextToken();
		String toekn3= st.nextToken();

		System.out.println("Emp_ID="+token1);
		System.out.println("Emp_Name="+token2);
		System.out.println("Emp_Salaary="+toekn3);	
	}
}
