//constructor has 1st line super() which is call to constructor of Parent class
class BCCI{
	
	int a=10;//this instance variable will be initialised in Constructor
	static int b=20;	
	BCCI(){
		//super()  [call to constructor of "Object" class]
		System.out.println("In BCCI constructor");
	}
}
class IPL extends BCCI{

	IPL(){
		//super() [call to constructor of "BCCI" class]
		System.out.println("In IPL constructor");
	}
}
class Match{

	public static void main(String [] args){
	
		IPL obj=new IPL();   //constructor is called implicitly after making object
		BCCI obj1=new BCCI();
	}
}
//In BCCI constructor
//In IPL constructor
//In BCCI constructor
