class Parent{
	
	int x=10;
	void m1(){
		System.out.println("In Parent's m1");
	}
}
class Child extends Parent{
	
	int x=20;
	void m1(){
		System.out.println("In Child's m1");
	
		System.out.println(x);
		System.out.println(super.x);
		super.m1();
	}
	public static void main(String [] args){
		
		Parent obj=new Child();
		obj.m1();
	}
}
