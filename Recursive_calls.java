//This Recursive call will result in StackOverflow Exception
class Vaibhav{

	void main(){
	
		System.out.println("In main");
		fun();
	}
	void fun(){
	
		System.out.println("In fun");
		main();
	}
	public static void main(String [] args){
	
		Vaibhav obj=new Vaibhav();
		obj.main();
	}
}
