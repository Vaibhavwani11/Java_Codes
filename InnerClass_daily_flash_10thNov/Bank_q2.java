/*2.Write a class outer called bank, inner class called Bank account holder, account and so on.
 Write the main method in another class.-
(Access method of outer class and inner class from another class.)*/
class Bank{

	class AccHolder{

		void m1(){
		
			System.out.println("Vaibhav Wani");
		}
	}
	class Employee{
		
		void m2(){
		
			System.out.println("50 Employees");
		}
	
	}
}
class Person{

	public static void main(String [] args){
	
		new Bank().new AccHolder().m1();
		new Bank().new Employee().m2();
	}
}
