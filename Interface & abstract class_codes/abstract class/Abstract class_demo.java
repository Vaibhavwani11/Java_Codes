//Some Methods can have body or some may not, so Abastract class Arises
//1.There can be 0 to 100% abstraction in abstract class
//2.abstract class cannot be instantiated
//3.abstract class has Constructor which can be called by Child class
abstract class Baba{

	Baba(){
	
		System.out.println("In abstract class Constructor");
	}
	abstract void marry(); //abstract Methods cannot have Body
	
	void career(){
		System.out.println("This is Concrete Method");
	}
}
class vaibhav extends Baba{

	public void marry(){  //abstract Methods must be Overriden in Child class
	
		System.out.println("abstract Method is Overrided by child class");
	}
	public static void main(String [] args){
	
		Baba obj=new vaibhav(); //Object cannot be created bt instance can be created of abstract class
		obj.marry();
		obj.career();
	}
}


