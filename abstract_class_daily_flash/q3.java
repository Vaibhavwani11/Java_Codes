/*3)An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call the
abstract method and the non-abstract method.*/
abstract class aClass{

	aClass(){
	
		System.out.println("This is Constructor of Abstract class");
	}
	abstract void aMethod();

	void m1(){
		
		System.out.println("This is Normal method of Abstract class");
	}
}
class subClass extends aClass{

	void aMethod(){
		
		System.out.println("This is Abstract Method");
	}
	public static void main(String [] args){
	
		subClass s=new subClass();
		s.aMethod();
		s.m1();
	}
}
