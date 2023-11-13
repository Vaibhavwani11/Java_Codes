/*3.Write a Java program which represents your house using inner class concept of Java.
 Write a class outer called flat, inner class called kitchen, bedroom and so on.
 Write the main method in another class.
(Access method of outer class and inner class from another class.)*/
class Flat{

	Flat(){
	
		System.out.println("Welcome Home!");
	}
	class kitchen{

		kitchen(){
			
			System.out.println("In Kitchen: ");
		}	
		void fn1(){
		
			System.out.println("Making Food");
		}
	}
	class Bedroom{
		Bedroom(){
			System.out.println("In Bedroom: ");
		}		

		void fn2(){
			System.out.println("Sleeping");
		}
	}
	class Hall{
		Hall(){
			System.out.println("In Hall: ");
		}

		void fn3(){
			System.out.println("Living Room");
		}
	}
}
class Family{

	public static void main(String [] args){
	
		Flat f=new Flat();
		
		Flat.kitchen kc= f.new kitchen();
		kc.fn1();
		
		Flat.Bedroom bd= f.new Bedroom();
		bd.fn2();

		Flat.Hall h= f.new Hall();
		h.fn3();
	}
}
