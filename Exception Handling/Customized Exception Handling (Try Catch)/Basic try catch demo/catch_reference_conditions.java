import java.io.*;
class catchDemo{

	public static void main(String [] args){
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		try{
//			String s=br.readLine();
			System.out.println("10/0");
		}
		catch(IOException ref){
					
		}
	}
}
