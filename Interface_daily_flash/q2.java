/*2.Write a java program having interface VaccineRegulatory Authority and class Pfizer, class Moderna and class BioNTech implementing this interface.*/
interface VaccineRegulatory{

	void distribution();  //by default This is "public abstract"
}
class Pfizer implements VaccineRegulatory{

	public void distribution(){  //Scope cannot be decreased,so method must be Public
	
		System.out.println("2 crore");
	}
}
class Moderna implements VaccineRegulatory{

	public void distribution(){  //Scope cannot be decreased,so method must be Public
	
		System.out.println("20 crore");
	}
}
class BioTech implements VaccineRegulatory{

	public void distribution(){  //Scope cannot be decreased,so method must be Public
	
		System.out.println("25 crore");
	}
}
class India{
	public static void main(String [] args){
	
		VaccineRegulatory vc =new Pfizer();
		vc.distribution();
		
		VaccineRegulatory vc2 =new Moderna();
		vc2.distribution();
		
		VaccineRegulatory vc3 =new BioTech();
		vc3.distribution();
	}
}
