class Outer{
	 int x=10;
	 class Inner{
	
		void m1(){
			System.out.println("In Method of inner class");
		} 
	 }
}
class anotherClass{
	
	public static void main(String [] args){

		new Outer().new Inner().m1();
	//OR
		Outer obj=new Outer();

		Outer.Inner obj1 =obj.new Inner();
		obj1.m1();
	}
}
