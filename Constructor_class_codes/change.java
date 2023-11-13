class compEngg{

	String name="Vaibhav";
	int age=18;

	compEngg(){
		System.out.println("In constructor");
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

		compEngg shubh=new compEngg();
		
		shubh.name="Shubham";
		shubh.age=19;
		shubh.display();
		
		veb.display();//change will be reflected to shubh object only bcoz there are 2 separate objects for veb & shubh
	}
}
