import java.io.*;
class NumberFormatDemo{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}
