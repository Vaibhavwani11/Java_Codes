class SARS{

	static void lockdown(){
			
		System.out.println("COVID-19");
	}

public static void main(String[] args){
	
	//method_name();
	lockdown();

	//class_name.method_name();
	SARS.lockdown();

	//calling by Object
	SARS obj=new SARS();
	obj.lockdown();
	

}
}
