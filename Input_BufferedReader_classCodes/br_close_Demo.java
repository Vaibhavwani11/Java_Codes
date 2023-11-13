//Using br.close() in code 
import java.io.*;
//BufferdReader and InputStreamReader classes are stored in io package
class InputDemo{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		/*Connection is built 
		character by character is taken and stored in BufferedReader
		until enter is pressed*/

		String inp1= br.readLine();
		System.out.println(inp1);

		String inp2= br.readLine();
		System.out.println(inp2);

		br.close();//close is method of BufferedReader class
		//BufferedReader connection is closed now
		//Program closed now no further operations can be performed
		
		br.readLine();
		//Exception in main Thread
		
		
		
	}
}
