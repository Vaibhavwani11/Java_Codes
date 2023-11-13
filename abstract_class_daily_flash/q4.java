/*4) write a RealTime example on Abstract class*/
abstract class Mall{

	abstract void Shopping();
}
class Vaibhav extends Mall{

	void Shopping(){
	
		System.out.println("T-shirt & Perfume");
	}
}
class shubh extends Mall{

	void Shopping(){
	
		System.out.println("Groceries");
	}
	public static void main(String [] args){
	
		Mall a=new shubh();
		a.Shopping();
	       		
		Mall b=new Vaibhav();
		b.Shopping();
	}
}
