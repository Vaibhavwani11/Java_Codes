/*Program 2:
Write a program to print the names of students by creating a Student class.
Pass name of student in constructor and 
If no name is passed while creating an object of Student class then name should be "Unknown"*/
class Student{

	Student(String name){
		
		System.out.println("Name= "+name);
	}
	Student(){
		
		System.out.println("Unknown");
	}
	
	public static void main(String [] args){
	
		Student obj=new Student("Vaibhav");
	}	

}
