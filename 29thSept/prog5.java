import java.io.*;
class Core2web{

	public static void main(String [] args)throws IOException{

		try{	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		}
		catch(IOException obj){
		//int isrRead=isr.read();
		//int brRead= br.read();

		System.out.println("Io occr");
		}
		char tier=br.read();
		System.out.println(tier);

	}
}
/*
Inp: a a
 */
