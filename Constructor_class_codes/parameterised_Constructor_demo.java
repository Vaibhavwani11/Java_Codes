//We can change private variables also by using Parameterised constructor
class compEngg{

	private String name="Vaibhav";
	private int age=18;

	compEngg(){
		System.out.println("In constructor");
	}
	compEngg(String newName, int newAge){
	
		name=newName;
		age=newAge;
	}
	void display(){
		
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
}
class Students{
	public static void main(String [] args){
	
		compEngg veb=new compEngg();
		veb.display();

		compEngg shubh=new compEngg("Shubham", 19);
		shubh.display();
		
		veb.display();//change will be reflected to shubh object only bcoz there are 2 separate objects for veb & shubhi
	}
}
