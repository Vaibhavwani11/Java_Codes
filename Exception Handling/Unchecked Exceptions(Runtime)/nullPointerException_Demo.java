class ArithmaticDemo{

	static void fun(){
		
		System.out.println("In fun");
		gun();
	}
	static void gun(){
		
		System.out.println("In gun");
		System.out.println(10/0);
	}
	public static void main(String [] args){
	
		System.out.println("In main");
		fun();
	}
}
