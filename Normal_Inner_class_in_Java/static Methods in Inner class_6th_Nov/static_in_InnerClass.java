//Inner class cannot have static(Methods & variables) declarations but 
//we can access static(variables & methods) from inner class
class Outer{

	static int x=20; 

	class Inner{
	
		//static int a=10;
		//Error:modifier 'static' is only allowed in constant variable declarations
		
	       	void myMethod(){
			
			System.out.println(x); //20(Accesing static var from innerClass)
			stMethod();
		}
	}
	public static void main(String [] args){
	
		new Outer().new Inner().myMethod();
	
	}
	
	static void stMethod(){
	
		System.out.println("You can access static from innerClass");

	}
}

