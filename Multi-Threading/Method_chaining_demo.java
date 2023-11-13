class Vaibhav{

	public static void main(String [] args){
		
		MethChaining obj=new MethChaining();
		obj.fun().gun();
	}
}
class MethChaining{
	
	public static int fun(){
	
		System.out.println("In fun()");
	}
	public void gun(){
	
		System.out.println("In gun()");
	}
}
