class MultipleTryCatch{

	void fun(){
	
		System.out.println("In Fun");
	}
	public static void main(String [] args){
	
		System.out.println("1st line");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException ref){
		
			System.out.println(10/1);
		}

		System.out.println("2nd line");
	
			MultipleTryCatch obj=null; //new MultipleTryCatch();
		try{
		
			//MultipleTryCatch obj=null; //new MultipleTryCatch();
			obj.fun();
		}	
		catch(NullPointerException ref){
		
			//MultipleTryCatch obj=new MultipleTryCatch();
			//obj.fun();
			System.out.println("Exception handled");
		}
	}
}
