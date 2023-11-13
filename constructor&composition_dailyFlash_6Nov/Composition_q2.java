/*Q2) A person has a job ,Now implement the composition with this and 
 print role,salery and id of the person
 (The composition is a restricted form of association in which two entities are highly dependent on each other)*/
class Employee{
	
	int empId=2201078;
	String role="Manager";
	double salery=1200000.00;

	Company comp=new Company();
	void empdetails(){

		System.out.println("Employee ID= "+empId);
		System.out.println("Employee Role= "+role);
		System.out.println("Employee Salary= "+salery);
		
		comp.performance();
	}
}
class Company{

	void performance(){

		System.out.println("Star Performer!");
	}
}
class HR{
	public static void main(String[] args){
	
		Employee e=new Employee();
		e.empdetails();
	}
}
