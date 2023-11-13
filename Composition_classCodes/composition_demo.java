class Hospital{

	String hName="Sanjeevani";
	int totalDoctors=25;

	Doctor obj= new Doctor();

	void Service(){
	
		System.out.println("Good Service");
		System.out.println("Hospital Name= "+hName);
		System.out.println("Total Doctors= "+totalDoctors);
		visitorDoctors();
	}
	void visitorDoctors(){
	
		obj.operation();
	}
}
class Doctor{

	String drName="SB Bhalerao";
	int numVisits=7;

	void operation(){
		System.out.println("Neuro Sergen");
	}
}
class patient{

	public static void main(String [] args){
	
		Hospital h=new Hospital();
		h.Service();
	}
}
