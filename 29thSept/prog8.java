import java.io.*;
class Core2web{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(isr);

		int age=isr.read();
	//	int brRead= br.read();

		System.out.println(age);
	}
}
/*
Inp: a a
 */
