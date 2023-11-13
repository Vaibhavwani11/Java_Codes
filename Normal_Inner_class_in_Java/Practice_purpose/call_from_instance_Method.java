class STES{

	class SITS{
	
		void Engg(){
		
			System.out.println("Engg. clg");
		}
	}
	class SIMCA{
	
		void MBA(){
		
			System.out.println("MBA clg");
		}
	}
	class SIOP{
	
		void Pharma(){
		
			System.out.println("Pharmacy clg");
		}
	}
	void call(){
		/*
		STES clg=new STES();

		SITS clg1=clg.new SITS();
		clg1.SITS(); {NO need of this bcz instance can be called directly from instance}*/
	
		SITS clg1=new SITS();
		clg1.Engg();
	}
	
	public static void main(String [] args){	

		STES obj=new STES();
		obj.call();
	}
}
