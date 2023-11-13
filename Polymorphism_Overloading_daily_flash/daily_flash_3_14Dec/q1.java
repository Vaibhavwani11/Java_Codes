/*Q1.A class named Arithmetic with a method named add that takes
 integers as parameters and returns an integer denoting their sum.
 A class named Adder that inherits from a superclass named Arithmetic.
 take another class which prints the sum and name of superclass of Adder*/
class Arithmatic{

	int sum=0;
	int add(int x,int y){
	 
		sum= x+y;

		return sum;
	}
}
class Adder extends Arithmatic{

	void add(){
		
		System.out.println(sum);
	}
}
class Test{

	public static void main(String [] args){
	
		int a=10, b=20;

		Arithmatic o=new Adder();
		o.add(a,b);
	//	o.print();
	}
}
