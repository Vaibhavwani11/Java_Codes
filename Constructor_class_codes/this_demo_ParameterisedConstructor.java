class compEngg{

	String name="Vaibhav";
	int age=18;

	compEngg(){
		System.out.println("No arguement Constructor");
	}
	compEngg(String name,int age){
		
		System.out.println("In Parameterised Constructor");
		name=name;   //It will not change the value
		age=age;     //So, this will be required		
		
		this.name=name; //now it will put the new value in above instance variables
		this.age=age;
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
		
		veb.display();//change will be reflected to shubh object only bcoz there are 2 separate objects for veb & shubh
	}
}
