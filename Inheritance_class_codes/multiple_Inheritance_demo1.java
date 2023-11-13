//Multiple Inheritance- Two Parent & one Child 
//It provides Ambiguity, hence it is not supported for classes,bt can be used for Interface
interface A{

	void m1();
}
interface B{

	void m2();
}
class C implements A,B{

	public void m3(){
	
	}
	
}
