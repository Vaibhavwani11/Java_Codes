//Overriding is re-writing methods having same name & same Parameters.
//Parent class
class Baba{

	void getProperty(){
	
		System.out.println("Bunglow");
	}
	void career(){  //Overriden Method
		
		System.out.println("Doctor");
	}
	void marry(){
		
		System.out.println("Alia bhat");
	}
}
//Child class
class Vaibhav extends Baba{

	void career(){ //Overriding Method
		
		System.out.println("Engineer");
	}
	void marry(){
		
		System.out.println("Shradhha Kapoor");
	}
}
class Kaka{

	public static void main(String []args){
	
		Baba b=new Baba();
	   	 b.getProperty();
		 b.career();
		 b.marry();
		
		 Vaibhav v=new Vaibhav();
	   	 v.getProperty();
		 v.career();
		 v.marry();

		Baba b1=new Vaibhav(); //Reference of Parent & Object of Child
	   	 b1.getProperty();     //Child's Method willl be called
		 b1.career();
		 b1.marry();
	}
}
