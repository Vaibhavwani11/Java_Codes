/* Take information of two students .Student info is:
 StudentName(String), Age(int) and marks(Double) as input from user and print it.
 use string tokenizer to handle empty space
e.g. Input from keyboard is: Vaibhav 	,18, 90.91
			     Shashi , 28 , 	90.99	
 */
import java.io.*;
import java.util.*;
class TrimDemo{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String studInfo= br.readLine();

		StringTokenizer st= new StringTokenizer(studInfo,",");

		//trim will remove all the whitespaces between Inputs
		String name= st.nextToken().trim();
		int age= Integer.parseInt(st.nextToken().trim());
		double marks= Double.parseDouble(st.nextToken().trim());

		System.out.println(name+" "+age+" "+marks);
	}
}
