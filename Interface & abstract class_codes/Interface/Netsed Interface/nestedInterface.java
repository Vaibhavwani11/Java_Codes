interface Outer{

	 void m1();
	 
		 interface Inner{
		 
			 void m2();
		 }
}
class xyz implements Outer,Outer.Inner{

	public void m1(){
	
		System.out.println("In m1 Method");
	}
	public void m2(){
	
		System.out.println("In m2 Method");
	}
}
class Test{

	public static void main(String [] args){
	
		Outer o1=new xyz();
		o1.m1();
	// 	o1.m2();   Error

		Outer.Inner i1=new xyz();
	//	i1.m1();   Error
		i1.m2();
	}
}
