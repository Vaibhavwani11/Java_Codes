//finally mdhe compulsory janar ch
class finallyDemo{

	public static void main(String [] args){
	
		try{
			System.out.println(10);
		}
		catch(ArithmeticException ae){
		
			System.out.println("ArithmeticException handled");
		}
		finally{
			
			System.out.println("In finally");	
		}
	}
}
