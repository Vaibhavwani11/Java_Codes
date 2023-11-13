import java.io.*;
class trycatchDemo{

	public static void main(String [] args){
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Before Exception");
		
		try{
			int a=Integer.parseInt(br.readLine());
		}
		catch(Exception ref){
		
			System.out.println("Exception handled");
		}
			
		System.out.println("After Exception handling");
	}
} 
