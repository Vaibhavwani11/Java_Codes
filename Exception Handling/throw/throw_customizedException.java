import java.io.*;
class OverWtException extends Exception{

	String msg;

//Writing constructor having String Parameter coz we want to Print the msg.
	OverWtException(String str){
	
		msg=str;
	}

//Overriding toString() method to print the passed string
	public String toString(){
	
		return msg;
	}
}
class Airport{

	static void WtCheck(int wt) throws OverWtException{
	
		if(wt>25)
			throw new OverWtException("OverWeight!");
		else
			System.out.println("Happy Journey!");
		
	}
	public static void main(String [] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Weight: ");
		int wt=Integer.parseInt(br.readLine());

		try{
			System.out.println("In Try");
			WtCheck(wt);  
		}
		catch(OverWtException obj){
		
			System.out.println("In Catch");
			System.out.println(obj.toString());
		
			//obj.printStackTrace();  to print stack trace also
		}
	}
}
