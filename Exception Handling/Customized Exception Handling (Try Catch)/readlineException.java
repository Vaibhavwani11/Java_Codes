import java.io.*;
class BufferedDemo{

	public static void main(String [] args) {
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try{
			br.close();
			System.out.println(br.readLine());
		}
		catch(Exception ie){
		
			System.out.println("IOException caught");
		}
	}
}
