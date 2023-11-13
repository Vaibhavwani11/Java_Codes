class NestedDemo{

	public static void main(String [] args){
	
		try{
		
			System.out.println("In try");
			try{
			
				System.out.println("In Inner try");
				System.out.println(1/0);
			}
			catch(ArithmeticException obj){
			
				System.out.println("In Inner catch");
				System.out.println("Handled");
			}
		}
		catch(NullPointerException ref){

			try{

				System.out.println("In Inner try(catch)");
			}
			catch(StringIndexOutOfBoundsException se){

				System.out.println("In Inner catch(catch)");
			}
		}
		finally{

			System.out.println("In finally");
			
			try{
				System.out.println("In try(finally)");
			}
			catch(ArithmeticException ae){

				System.out.println("In catch(finally)");
			}
		}
	}
}
