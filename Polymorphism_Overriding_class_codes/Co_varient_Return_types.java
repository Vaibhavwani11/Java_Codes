/*Co-varient Return types: 
 	Object    String
	Number	  Integer
	Number	  Float
 
 */
class Parent{

	Object m1(){

		System.out.println("Parent m1");
	return "null";
	}
}
class Child extends Parent{

	String m1(){
	
		System.out.println("Child m1");
	return "hello";
	}
}
class Test{

	public static void main(String [] args){

		Parent p=new Child();
		p.m1();	
	}
}
