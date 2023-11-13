class Capgemini{
	static int noofEmp=200000;
	int projectCount=200;
	
	void displayProject(){
		System.out.println("Capgemini project="+projectCount);
	}
	static void empInfo(){
		System.out.println("Capgemini Employes="+noofEmp);
	}
}
class TCS{
	static int noofEmp=300000;
	int projectCount=300;

	void displayProject(){
		System.out.println("TCS project="+projectCount);
	}
	static void empInfo(){
		System.out.println("TCS Employee="+noofEmp);
	}
}
class IT_company{
	public static void main(String[] args){
		Capgemini Pune=new Capgemini();
		Pune.projectCount=130;
		Pune.displayProject();
	
		Pune.empInfo();

		Capgemini Banglore=new Capgemini();
		Banglore.projectCount=70;
		Banglore.displayProject();
	
		Banglore.empInfo();
		
		TCS Mumbai=new TCS();
		Mumbai.projectCount=150;
		Mumbai.displayProject();
	
		Mumbai.empInfo();

		TCS Chennai=new TCS();
		Chennai.projectCount=50;
		Chennai.displayProject();
	
		Chennai.empInfo();
		
		
	}
}