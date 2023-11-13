class Dada{

	int a=10;
	static int b=15;

	void insMethod(){
	
		System.out.println(a);
		System.out.println(b);
	}
	static void staticMethod(){
	
		Dada obj=new Dada();

		System.out.println(obj.a);
		System.out.println(b);
	}
}
class Vaibhav{// extends Dada{

	void m1(){
		
		Dada d=new Dada();
		
		System.out.println(d.a);
		System.out.println(Dada.b);
	}
	static void m2(){
	
		Dada o=new Dada();
		System.out.println(o.a);
		System.out.println(Dada.b);
	
	}
	public static void main(String [] args){
		
		Vaibhav obj=new Vaibhav();
		obj.m1();  //obj.methodName();
		m2();      //methodName();     {direct call}
	
		Dada n=new Dada();
		n.insMethod();       //object.instMethod
		Dada.staticMethod(); //className.statMethod
	}
}
