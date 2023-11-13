/*Q4) Write a real time example showing composition containing 3 classes.
Program Structure : First two classes will have their private variables, constructors and methods.
In Third class inside main method pass the user input to constructors
of both classes and call their methods accordingly.*/
class College{

	private int numTeachers=50;

	College(){
	
		System.out.println("In Constructor");
		System.out.println("Welcome to Seminar!");
	}
	guestLecture obj=new guestLecture();

	void Seminar(){
		
		System.out.println("Number of College Teachers= "+numTeachers);
		obj.guestFaculty();
	}
}
class guestLecture{

	private int time=4;
	void guestFaculty(){
	
		System.out.println("Dr. Vijay Ghokhale");
		System.out.println("Lecture Duration= "+time);
	}
}
class Induction{

	public static void main(String [] args){
	
		College c=new College();
		c.Seminar();
	}
}

