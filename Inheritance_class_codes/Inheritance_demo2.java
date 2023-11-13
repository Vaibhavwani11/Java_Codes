//If object is made like:  Refernce of Parent & obj. of Child then we can only call methods of Parent class
class Core2Web{

	Core2Web(){
	//	System.out.println("In core2Web constructor");
	}
	protected void Learning(){
		
		System.out.println("Guide: Shashi Sir");
	}
	private void m1(){
		
		System.out.println("Guide: Shashi Sir");
	}
	void m2(){
		System.out.println("m2");

	}
	public void m3(){

	}
}
class Incubator extends Core2Web{
	
	Incubator(){
	//	System.out.println("In Incubator constructor");
	}
	void implement(){
		
		System.out.println("Projects");
		Learning();
	//	m1();
		m2();
	}
	
}
// class Network extends Core2Web{

// 	Network(){
// 		System.out.println("In Network constructor");
// 	}
// 	void connect(){
		
// 		System.out.println("Coders Community");
// 	}
// }
class Student{

	public static void main(String [] args){	
		
		Core2Web c2w=new Core2Web();

		Incubator ib=new Incubator();
		ib.implement();
		ib.Learning();

		// Network nt=new Network();
		// nt.connect();
		// nt.Learning();

		Core2Web obj=new Incubator(); 	//Reference of Parent and object of Child
		obj.Learning();
//		obj.implement();  //Error{we can not call method of Child class if Reference is of Parent class}
	}
}
