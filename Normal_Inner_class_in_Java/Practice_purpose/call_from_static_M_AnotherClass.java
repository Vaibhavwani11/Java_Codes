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
}	
	
class Student{
	
	public static void main(String [] args){	

		STES obj=new STES();
		
		STES.SITS clg1=obj.new SITS();
		clg1.Engg();
	}
}
