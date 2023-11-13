/*Q3.If we have a function in the base class and a function with the same name in a derived class,
  can the base class function be called from the derived class object?
  Explain with an example.:=YES*/
class BCCI{
	
	void fun(int x){
		System.out.println("fun in BCCI");
	}
}
class IPL extends BCCI{

	void fun(int x,int y){
		System.out.println("fun in IPL");
	}
	public static void main(String [] args){
		
		IPL obj=new IPL();
		obj.fun(10);    //fun in BCCI
		obj.fun(10,20); //fun in IPL
	}
}
