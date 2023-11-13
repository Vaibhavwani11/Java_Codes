class Outer{

	void m1(){
	
		System.out.println("In m1");
	}
	interface Inner{
	
		void m2();
	}
}
class Vaibhav extends Outer implements Outer.Inner{

	public void m2(){
	
		
	}
}
class Test{

	public static void main(String [] args){
	
		Vaibhav v=new Vaibhav();
		//v.m1();
		v.m2(); 

		Outer o=new Outer();
		o.m1();

		Outer.Inner oi=new Vaibhav();
		//oi.m1();
		oi.m2();
	}
}
