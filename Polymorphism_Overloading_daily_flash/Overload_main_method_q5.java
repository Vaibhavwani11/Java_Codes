/*Q 5. Is it possible to overload the main method(Explain with example);=YES*/
class Demo{

	public static void main(int x){
		
		System.out.println("int in main");
		Demo obj=new Demo();
	}
	public static void main(String [] args){
	
		System.out.println("String in main");
	
		Demo o1=new Demo();
		//main(10);
	}
	
}
class Test{

	public static void main(String [] args){
	
		Demo.main('a');
	}
}
