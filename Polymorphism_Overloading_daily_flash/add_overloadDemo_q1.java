/*Q1. Write a program having a class Calculator in which write a method 
 for the addition of two numbers and overload the same method to add three numbers.
 Example: add(10,20);
 	Output: Addition of two operands is 30 
 	  add(10,20,30) 
 	Output:Addition of Three operands is 60*/
class Calculator{

	void add(int x,int y){
	
		System.out.println(x+y);
	}
	void add(int x,int y,int z){
	
		System.out.println(x+y+z);
	}
}
class Pass{

	public static void main(String [] args){
	
		Calculator calc=new Calculator();
		calc.add(10,20);
		calc.add(10,20,30);
	}
}
