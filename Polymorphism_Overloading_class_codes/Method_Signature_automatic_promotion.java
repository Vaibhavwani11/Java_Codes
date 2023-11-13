//Compiler checks Method Signature at compile time.  
//Method Signature is Method name & data type of Parameter.{i.e.m1(int)}
//If exact match of data type is not found then "automatic Promotion" is done: 
//char->Int->long->float->double
//byte->short->Int->long->float->double

class overloadDemo{

	void m1(int x){
		System.out.println("Int in m1");
	}
	void m1(float x){
		System.out.println("Float in m1");
	}
}
class Test{

	public static void main(String [] args){
		
		overloadDemo obj=new overloadDemo();
		obj.m1('A');//This char will be passed to m1(int){automatic Promotion}
		obj.m1(50); //Passed to m1(int)

		obj.m1(22.5f);//Passed to m1(float)
		obj.m1(10235l);//This long will be passed to m1(float)
//		obj.m1(22.5);  error: no suitable method for double 

	}
}
