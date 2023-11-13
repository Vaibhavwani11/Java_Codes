//final method cannot be Overrided
/*Overidden Method     Overiding Method
      final		 void  => Error
      final 		 final => Error
      void 		 final => Ok
*/
class finalDemo{

	final void m1(){
	
		System.out.println("final m1 Parent");
	}
}
class Child extends finalDemo{

	void m1(){
	
		System.out.println("final m1 child");
	}
}
class Test{

	public static void main(String [] a){
	
		Child c=new Child();
		c.m1();
	}
}
