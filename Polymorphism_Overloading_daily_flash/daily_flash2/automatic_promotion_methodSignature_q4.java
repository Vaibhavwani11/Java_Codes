/*Program 4. Write a Java program with class Demo that has overloaded method m1() with parameters: -int -float
Make the call to the method using m1('A'); Explain the output using comments*/
class Demo{

	void m1(int x){
	
		System.out.println("Int Method");
	}
	void m1(float x){
	
		System.out.println("Float Method");
	}
	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1('A'); //Int Method bcoz char is automatic Promoted to int
	}
}

