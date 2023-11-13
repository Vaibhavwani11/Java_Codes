//static method cannot be Overrided
//If both overriden and Overriding Methods are static then it it "Method Hiding"
class staticDemo{

	static void m1(){
	
		System.out.println("In static m1");
	}
}
class Child extends staticDemo{

	static void m1(){
		
		System.out.println("In m1");
	}
	public static void main(String [] args){
	
		Child s1=new Child();
		s1.m1();
	}
}
