/* Take student name(String),Grade(char),age(int),marks(double) as input from user and print it.
 Use string Tokenizer.
 E.g. Vaibhav A 18 99.99
Output: Name: Vaibhav
	Grade: A
	Age: 18
	Marks: 99.99
 */
import java.io.*;
import java.util.*;
class Tokenize{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String studInfo=br.readLine();

		StringTokenizer st= new StringTokenizer(studInfo," ");

		String name= st.nextToken();
		int age= Integer.parseInt(st.nextToken());
		double marks= Double.parseDouble(st.nextToken());
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
	}
}
