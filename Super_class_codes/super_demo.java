//We can write super() in constructor by our own.
class Parent{

	Parent(){
		super();
		//super();
		System.out.println("In Parent's constructor");
		//super();
	}
}
class Child extends Parent{
	
	Child(){
		super();
		System.out.println("In Child's constructor");
	}

	public static void main(String [] args){
		
		Parent obj=new Child();	
	}
}
