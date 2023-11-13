/*Q1 Write a Java Program with a default Constructor and 
  a non-static method and call from the constructor.*/
class ConstructorDemo{
	
	ConstructorDemo(){
	
		fun();
	}
	void fun(){
	
		System.out.println("Call to nonstatic Method");
	}
	public static void main(String [] args){
	
		ConstructorDemo obj=new ConstructorDemo();
	}
}
