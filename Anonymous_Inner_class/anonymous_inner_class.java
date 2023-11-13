//Anonymouus Inner class is written at the time of making object.
//Parent class of anonymous Inner class is Trip.
//Name of anonymous Inner class is Outer$1.class given by Compiler.{i.e Today$1.class}
class Trip{
	
	Trip(){
	
		System.out.println("Constructor of Parent class");
	}
	void place(){
	
		System.out.println("Goa!");
	}
}
class Today{

	public static void main(String [] args){
	
		Trip obj=new Trip(){
			//This is anonymous Inner class:	
			void place(){
			
				System.out.println("Alibaug!");
			}
		};
		obj.place();
	}
}
