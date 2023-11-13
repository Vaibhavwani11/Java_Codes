//Inner class is Treated like instance method
class Outer{
	 int x=10;
	 class Inner{
	
		void fun(){
			System.out.println("In Method of Inner class");
		} 
	 }
}
class anotherClass{
	
	void m2(){
	
		Outer o=new Outer();
		System.out.println(o.x); //10

		Outer.Inner i=o.new Inner();
		i.fun();
	}
	public static void main(String [] args){
	
		anotherClass i=new anotherClass();
		i.m2();
	}
}
