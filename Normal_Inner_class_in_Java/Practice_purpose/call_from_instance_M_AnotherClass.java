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
	
	void call(){
		
		STES clg=new STES();

		STES.SITS clg1=clg.new SITS();
		clg1.Engg();// {Object needs to be created}*/
	}
	
	public static void main(String [] args){	

		Student obj=new Student();
		obj.call();
	}
}
