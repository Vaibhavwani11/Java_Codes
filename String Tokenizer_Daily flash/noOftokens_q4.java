/*Take hardCoaded information as a String 
 for E.g. String one= SWAROOP, A,2, 324.2
 	  String two= SONIA, C, 23,522.5
print the info at new line use for loop for SWAROOP and while loop for SONIA
Output: Number of tokens=4
 	 SWAROOP
	 A
	 2
	 324.2
	 Number of tokens=4
 	 SONIA
	 C
	 23
	 522.5	*/
import java.io.*;
import java.util.*;
class Tokenize{

	public static void main(String [] args)throws IOException{
		
	//	String s1="Vaibhav" ;
		StringTokenizer st= new StringTokenizer(s1," ");
	
		String s1="Vaibhav" 18 9.5;

		String name= st.nextToken();
		int num= Integer.parseInt(st.nextToken());
		double d= Double.parseDouble(st.nextToken());

		for(int i=0; i<3; i++){

			System.out.println(s1);
		}
		//System.out.println(num);
		//System.out.println(d);

		//String s2= Sonia,C,23,522.5
	}
}
