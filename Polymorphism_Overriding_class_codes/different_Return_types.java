class Parent{

	void m1(){
	
		System.out.println("Parent m1");
	}
}
class Child extends Parent{

	String m1(){
	
		System.out.println("Parent m1");
	return "hello";
	}
}
class Test{

	public static void main(String [] args){

		Parent p=new Parent();
		p.m1();	
	}
}
