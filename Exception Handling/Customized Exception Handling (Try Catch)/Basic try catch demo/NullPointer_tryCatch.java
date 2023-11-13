class trycatchDemo{

	public static void main(String [] args){
	
		try{
			trycatchDemo obj=null;//new trycatchDemo();
	
			obj.fun();
		}
		catch(NullPointerException ref){
		
			System.out.println("Exception handled");
		}
		
		System.out.println("After Exception handling");
	}
	void fun(){
	
		System.out.println("In Fun");
	}
}
