class AB{

	class B{
	
		void m1(){
	
			System.out.println("Hello");
		}
	}
}
class A{

	public static void main(String [] args){
	
		AB obj=new AB();

		AB.B o1=obj.new B();
		o1.m1();

		
	}
}
