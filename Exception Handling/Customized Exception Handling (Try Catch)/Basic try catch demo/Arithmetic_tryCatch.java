class trycatchDemo{

	public static void main(String [] args){
	
		System.out.println("Before Exception");
		
		try{
			System.out.println(10/0);
		}
		catch(Throwable obj){ //Exact Exception or Parent class of that Exception can be written in catch block
		
			System.out.println("Exception Handled");
		}
	
		System.out.println("After Exception handling");
	}
}
