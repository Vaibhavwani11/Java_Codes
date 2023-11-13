//Taking String as input from user
import java.io.*;
//BufferdReader and InputStreamReader classes are stored in io package
class InputDemo{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		//Connection is built 
		//character by character is taken and stored in BufferedReader
		//until enter is pressed
			
	//	br.readLine();//readLine is the method of BufferedReader class
		//Return type of readLine is String

		String name=br.readLine();

		// float x= Float.parseFloat(br.readLine());
		// System.out.println(x);

double y= Double.parseDouble(br.readLine());
System.out.println(name);

System.out.println(y);

		//System.out.println(br.readLine());//string stored in BufferedReader is printed directly

	}
}
