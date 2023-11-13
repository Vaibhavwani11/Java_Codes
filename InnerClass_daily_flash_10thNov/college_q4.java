/*4. Write a Java program which represents a restaurant menu card using inner class concept of Java.
  Write a class out er called College, inner class called Comp Dept, IT Dept and so on.
  Write the main method in another class.
 (Access method of outer class and inner class from another class.)*/
class College{

	College(){
	
		System.out.println("Sinhgad Institute of Technology and Science");
	}
	class CompDept{
		void fn1(){
		
			System.out.println("This is Computer Department");
		}
	}
	class ITDept{

		void fn1(){
			System.out.println("This is IT Department");
		}
	}

}
class Student{

	public static void main(String [] args){
	
		College c=new College();
		
		College.CompDept cmp= c.new CompDept();
		cmp.fn1();
		
		College.ITDept it=c.new ITDept();
		it.fn1();
	}
}
