import java.io.*;
class ThrowDemo{

	public static void main(String [] args){
	
		IOException io=new IOException("Aplach Exception");
			
		try{
			throw io;
		}
		catch(IOException obj){
			
			System.out.println(obj);
		}
	}
}
