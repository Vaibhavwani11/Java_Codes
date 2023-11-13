class Dada{

	void insMethod(){
	
		System.out.println("In instance method of Dada");
		staticMethod();	
		demo();
	}
	void demo(){
	
		System.out.println("Demo");
	}
	static void staticMethod(){
	
		System.out.println("In static method of Dada");
	}
}
class Vaibhav{// extends Dada{

	void m1(){
	
		System.out.println("In instance method of Vaibhav");
		Dada d=new Dada();

		d.demo();
		Dada.staticMethod();
	}
	static void m2(){
	
		System.out.println("In static method of Vaibhav");
	}
	public static void main(String [] args){
		
		Vaibhav obj=new Vaibhav();
		obj.m1();  //obj.methodName();
		m2();      //methodName();     {direct call}
	
		Dada o=new Dada();
		o.insMethod();       //object.instMethod
		Dada.staticMethod(); //className.statMethod
	}
}
