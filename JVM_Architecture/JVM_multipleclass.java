class CompBranch{
	
	static int noofStudents=500;
	int practicalsCount=30;

	static void studentsCount(){
		System.out.println("Number of students in Comp=" +noofStudents);
	} 
		
	void Practicals(){
		System.out.println("Comp Practicals performed=" +practicalsCount);
	}	
}
class Mechanical{
	static int noofStudents=400;
	int practicalsCount=25;

	static void studentsCount(){
		System.out.println("Number of Students in Mech=" +noofStudents);
	}
	void Practicals(){
		System.out.println("Mech Practicals performed=" +practicalsCount);
	}
}
class SITS{
	public static void main(String[] args){
		CompBranch Div1=new CompBranch();
		Div1.practicalsCount=12;
		Div1.Practicals();
		Div1.studentsCount();
	
		

		CompBranch Div2=new CompBranch();
		Div2.practicalsCount=18;
		Div2.Practicals();
		Div2.studentsCount();
	
		

		Mechanical DivA=new Mechanical();
		DivA.practicalsCount=13;
		DivA.Practicals();
		DivA.studentsCount();
	
		

		Mechanical DivB=new Mechanical();
		DivB.practicalsCount=12;
		DivB.studentsCount();
	
		DivB.Practicals();		
	}
}