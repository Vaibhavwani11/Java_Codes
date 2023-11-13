class Multiple_tryCatch{

	public static void main(String [] args){
	
		System.out.println("Statement 1");
		try{
		
			System.out.println("Statement 2");
			System.out.println(10/0);
			System.out.println("Statement 3");
		}
		catch(ArithmeticException a){
		
			System.out.println("Statement 4");
		}
		System.out.println("Statement 5");
		
		Multiple_tryCatch obj=null;//new Multiple_tryCatch();
		
		try{
			obj.fun();
		}
		catch(NullPointerException ne){
			
			System.out.println("NullPointerException handled");
		}
	}
	void fun(){
	
		System.out.println("In fun");
	}
}
