/*2. Write a java code to print variable from parent class name Library and child class name Book 
in method info() present in Book class.*/
class Library{
	
	String b1="Let us Java";
	String b2="Internal JVM";
	
}
class Book extends Library{

	void info(){
	
		System.out.println("Books available= "+b1+" & "+b2);
	}
}
class reader{

	public static void main(String [] args){
	
		Book b=new Book();
		b.info();
	}
}
