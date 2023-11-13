import java.util.*;
class ThrowsDemo{ //throws ArithmeticException{

	public static void main(String [] args) throws InputMismatchException{
	
		ThrowsDemo obj=new ThrowsDemo();
	}
	static{ //throws ArithmeticException{
	
		System.out.println("Hello");
	}
	ThrowsDemo() throws NullPointerException{
	
		System.out.println("Hii");
	}
}
/*We can throw Exception on:
1.Method
2.Constructor

Cannot throw Exception on:
1.Class
2.static block
*/
