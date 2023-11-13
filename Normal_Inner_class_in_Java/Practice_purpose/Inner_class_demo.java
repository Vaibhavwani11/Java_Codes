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

	public static void main(String [] args){	

		STES obj=new STES();
		//obj.Engg(); 

		SITS clg1=obj.new SITS();
		clg1.Engg();

		SIMCA clg2=new STES().new SIMCA();
		clg2.MBA();

		STES.SIOP clg3=obj.new SIOP();
		clg3.Pharma();
	}
}
