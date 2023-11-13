//Ambigious call to method bcoz parameters can be accepted by both m1(int float)& m1(float int)
class Demo{

	void m1(int x,float y){
	
		System.out.println("Int-Float Parmeter");
	}
	void m1(float x,int y){
	
		System.out.println("Float-Int Parmeter");
	}
	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1(10,10.5f); //m1(int,float)
		obj.m1(10.5f,10); //m1(int,float)
//		obj.m1(10,10); Reference to m1 is ambigious bcoz (10,10) can be accepted by both m1(int float)& m1(float int)

//		obj.m1(10.5f,10.5f); //No suitable method found for m1(float, float)
	}
}

