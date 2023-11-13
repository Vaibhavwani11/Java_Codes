class Outer{

	void outFun(){
	
		System.out.println("In Outer class fun");
	}
	static class Inner{
	
		static void inFun(){
		
			System.out.println("In inner class fun");
		}
	}
}
class Test{

	public static void main(String [] args){
	
		Outer o=new Outer();
		o.outFun();

	//	Outer.Inner i=o.new Inner();
	//	i.inFun();
	}
}
