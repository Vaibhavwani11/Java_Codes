class BCCI{

	String presName="Saurav Ganguli";
	int years= 2;

	BCCI(){
		System.out.println("In BCCI Constructor");
	}
}
class IPL{   

	IPL(){
		System.out.println("In IPL Constructor");
	}
	IPL(BCCI obj){ 
	
		System.out.println("In Parameterised Constructor");
		System.out.println("President= "+obj.presName);
		System.out.println("Years= "+obj.years);
	}
}
class IPL2020{

	public static void main(String [] args){
	
		BCCI b= new BCCI();
		
		IPL obj2=new IPL(b);//Passing object as parameter to Constructor
	}
}
