class Outer{

	//Outer class Method will be availible to Outer class only
	void m1(){
	
		System.out.println("Outer m1");
	}
	//Inner class Method will be availible to Inner class only
	interface Inner{
		
		void m2();
	}
}
class xyz extends Outer implements Outer.Inner{

	public void m2(){
	
		System.out.println("Inner m2");
	}
}
class Test{

	public static void main(String [] args){
	
		Outer o=new xyz();
		o.m1();
		
		Outer.Inner inn=new xyz();
		inn.m2();
	}
}
