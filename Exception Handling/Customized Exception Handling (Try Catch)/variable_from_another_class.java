class Variable{

	static int x=20;
	
	void m1(){
	
		System.out.println("In m1");
	}

}
class tryCatchDemo{

	void m2(){
	
		System.out.println("In m2");	
		m1();
	}
//	static int x=20;

	public static void main(String [] args){
	
		tryCatchDemo obj=new tryCatchDemo();
		obj.m2();

	//	Variable.m1();
		/*Variable obj=new Variable();
		try{
		
			System.out.println(x);
		}
		catch(ArithmeticException ref){
		
			System.out.println("Handling Code");
	//	}*/
	}
}
