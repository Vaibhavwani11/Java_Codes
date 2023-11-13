/*03.guess the output of following program and explain the answer *
ERROR: call to Method test is ambigious
{because both Integer(wrapper class) & String can accept "null"}
*/
class Demo {

	void test(Integer i) {

		System.out.println("test(Integer)");
	
	}
	void test(String name) { 
	
		System.out.println("test(String)");
	}
	
	public static void main(String [] args){

		Demo obj = new Demo ();
		obj.test(null);
	}
}

