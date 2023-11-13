class Vaibhav{
	
	static Vaibhav obj=new Vaibhav();
	
	void fun(){
	
		System.out.println("Hello");
		obj.main();  //we cannot call main Method
	}
	
	public static void main(String [] args){
	
		//Vaibhav obj=new Vaibhav();
		obj.fun();
	}
}
