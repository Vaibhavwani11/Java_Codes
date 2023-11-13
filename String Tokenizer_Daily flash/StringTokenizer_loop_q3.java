/* Take information of 3 students(Use any loop) 
 Student info is: StudentName(String), Age(int) and marks(Double) as input from user and print it.
 use string tokenizer, delimiter is " "
 */
import java.io.*;
import java.util.*;
class Tokenize{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

	for(int i=0; i<3; i++){
		System.out.println("Enter Name,Age and Marks:");
		
		String studInfo = br.readLine();
		
		StringTokenizer st=new StringTokenizer(studInfo," ");

		String token1= st.nextToken();
		String token2= st.nextToken();
		String token3= st.nextToken();
	
		String name= token1;
		int age= Integer.parseInt(token2);
		double marks= Double.parseDouble(token3);

		System.out.println("Name= "+token1);
		System.out.println("Age= " +token2);
		System.out.println("Marks= "+token3);
	}
	}
}
