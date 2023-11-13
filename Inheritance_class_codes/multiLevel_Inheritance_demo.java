//Multi-Level Inheritance 
class ICC{
	
	ICC(){
		System.out.println("In ICC constructor");	
	}
}
class BCCI extends ICC{
	
	BCCI(){
		System.out.println("In BCCI constructor");	
	}

}
class IPL extends BCCI{

	IPL(){
		System.out.println("In IPL constructor");	
	}
}
class Match{

	public static void main(String [] arhs){
	
		ICC icc=new ICC();
		BCCI obj=new BCCI();
		IPL obj2=new IPL();
	}
}
