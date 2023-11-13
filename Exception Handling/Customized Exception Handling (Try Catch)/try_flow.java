class tryFlow{

	public static void main(String [] args){
	
		System.out.println("Statement 1");
		try{
		
			System.out.println("Statement 2");
			System.out.println(10/00);
			System.out.println("Statement 3"); //This won't be printed bcoz it won't come again in try after catch
		}
		catch(ArithmeticException ref){
			
			System.out.println("Statement 4");
		}
		System.out.println("Statement 5");
	}
}
