//Scope can be Increased i.e. deafault to Public / default to Protected 
//bt can't be Reduced    i.e. public to default / protected to default  
// 			 Private has access only within class so, it can't be Overrided
class Parent{

	void m1(){
	
		System.out.println("Default Modifier");
	}
}
class Child extends Parent{

	public void m1(){
	
		System.out.println("public Modifier");
	}
}
class Test{

	public static void main(String [] args){
	
		Parent p=new Child();
		p.m1();
	}
}
