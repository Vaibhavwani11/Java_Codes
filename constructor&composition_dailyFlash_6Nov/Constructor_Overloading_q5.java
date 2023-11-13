/*Q5) Write a java program to demonstrate constructor overloading. 
 Take a class StudentData and create two objects of it.
 One is with default constructor and another one using parameterized constructor.
 Both the constructors have different initialization code.*/
class StudentData{

	String studName="Vaibhav";
	int rNum=78;

	StudentData(){
		
		System.out.println("No Arguement Constructor");
		
		System.out.println("Student Name= "+studName);
		System.out.println("Student Roll Number= "+rNum);
		
	}
	StudentData(String studName, int rNum){
	
		this.studName=studName;
		this.rNum= rNum;

		System.out.println("In Paramterised Constructor");

		System.out.println("Student Name= "+studName);
		System.out.println("Student Roll Number= "+rNum);
	}
	public static void main(String [] args){
		
		StudentData obj1=new StudentData();
		StudentData obj2=new StudentData("Shubham",32);
		StudentData obj3=new StudentData("Ganesh",55);
	}

}
