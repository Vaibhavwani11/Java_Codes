//Basic example of Inheritance [BCCI is Parent class & IPL is Child class]
//We can call method of Parent class in Child class
//bt, we can't call method of Child class by obj of Parent class
class BCCI{

	int x=10;
	BCCI(){
		//super() {call to constructor of "Object" class}
		System.out.println("In BCCI Constructor");
	}
	void rulesBCCI(){
	
		System.out.println("Rules by BCCI");
	}
}
class IPL extends BCCI{

	IPL(){
	     //super() {call to constructor of Parent class}
	      System.out.println("In IPL Constructor");
	}
	void rulesIPL(){
	
		System.out.println("Rules by IPL");
	}
}
class Match{

	public static void main(String [] args){
		
		IPL ipl2020=new IPL();
		ipl2020.rulesIPL();
		ipl2020.rulesBCCI();
		
		BCCI obj= new BCCI();
		obj.rulesBCCI();
//error		obj.rulesIPL();   :-cannot find symbol
	}
}
