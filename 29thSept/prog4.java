
import java.io.*;
class Core2web{

	public static void main(String [] args)throws IOException{

		try{	
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			int totalKeyboardKeys= Integer.parseInt(br.readLine());
			
			System.out.println(totalKeyboardKeys);
		}
		
		catch(IOException obj){
		//int isrRead=isr.read();
		//int brRead= br.read();

		System.out.println("Io occr");
		}
		

	}
}
/*
Inp: a a
 */
