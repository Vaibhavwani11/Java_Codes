/*Q4. Write a program to overload method in which one of the methods should have 
  varg parameter(refer example taught in lecture overlading part 2)*/
class Demo{

	void m1(char ...args){
	
		System.out.println("char var args Method");
	}
	void m1(char x){
		
		System.out.println("char Method");
	}
}
class Test{

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1('A');
		obj.m1('A','B');
	}
}
