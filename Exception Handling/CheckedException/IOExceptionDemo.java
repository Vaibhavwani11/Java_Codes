import java.io.*;
class IOExceptionDemo{

	public static void main(String []args){
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	
		int a=Integer.parseInt(br.readLine());
	        //Unreported exception IOEXception must be caught or declared to be thrown
	}
}
