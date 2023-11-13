import java.util.*;
import java.lang.*;
class Outer{

	class Inner{
	
		void method(){
			System.out.println("Hello");		
		}
	}
	public static void main(String [] args){
	
		Outer o= null; //nullPointerException {call to getClass method is given in bytecode}
		Inner i= o.new Inner();	
		i.method();
	}
}
