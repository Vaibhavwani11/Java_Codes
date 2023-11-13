class Demo{
	
	//It is just like default in switch case.If no exact match is found then parameter will be passed to ...args
	void m1(int...args){

		System.out.println("Var args Method");
	}
	void m1(int x){
		
		System.out.println("Int Method");
	
	}
}
class Test{

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1(10);  //Int Method
		obj.m1(10,20,30); //Var args Method
	}
}
