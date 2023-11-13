//static outer class cannot be written, bt we can write inner class as 'static'
class Vaibhav{

	//static constructor is not allowed also.
	static Vaibhav(){

		System.out.println("In static constructor.");
	}
	void fun(){
	
		System.out.println("Static class is written");
	}
	public static void main(String [] args){
	
		Vaibhav v=new Vaibhav();
		v.fun();
	}
}
