/*1. Write a Java program with a class Demo and overload method functionCall(), with
 -int, float, char and String as parameters. 
 In the main function, call the same using respective values*/
class Demo{
	
	void funCall(int x){
		System.out.println("Int in fun");
	}

	void funCall(float x){
		System.out.println("Float in fun");
	}
	void funCall(char x){
		System.out.println("Char in fun");
	}
	void funCall(String x){
		System.out.println("String in fun");
	}
}
class Pass{

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.funCall(10);
		obj.funCall(22.5f);
		obj.funCall('A');
		obj.funCall("Vaibhav");
	}
}

