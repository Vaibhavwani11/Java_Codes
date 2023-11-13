interface A{

	int a=10; //variable in interface must be initialized(must assign value)
}
class B implements A{

	int b=20;
	public static void main(String [] args){
	
		A ref =new B();
		//System.out.println(ref.a);
		System.out.println(ref.a);
		
		B obj =new B();
		//System.out.println(obj.a);
		System.out.println(obj.b);
		

	}
}
