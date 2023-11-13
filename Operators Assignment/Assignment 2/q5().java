class Pune{
	static int covidActivCases=5000;
	int totalCases=7000;
	
	static void noCorona(){
		System.out.println("Go Corona from Pune!!!");
	}
		
	void lockdown(){
		covidActivCases++;
		totalCases++;
		System.out.println("Cases in Pune during lockdown="+totalCases);					
		System.out.println("Active Cases in Pune during lockdown="+covidActivCases);

	}
	void noLockdown(){
		covidActivCases++;
		totalCases++;
		System.out.println("Cases in Pune during Unlock="+totalCases);				
		System.out.println("Active Cases in Pune during Unlock="+covidActivCases);

	}
}
	
class Mumbai{
	static int covidActivCases=8000;
	int totalCases=10000;
	
	static void noCorona(){

		System.out.println("Go Corona from Pune!!!");		
	}
		
	void lockdown(){
		covidActivCases++;
		totalCases++;
		System.out.println("Cases in Mumbai during lockdown="+totalCases);								System.out.println("Active Cases in Mumbai during lockdown="+covidActivCases);

	}
	void noLockdown(){
		covidActivCases++;
		totalCases++;
		System.out.println("Cases in Mumbai during Unlock="+totalCases);								System.out.println("Active Cases in Mumbai during Unlock=" +covidActivCases);

	}
}
class Main{
	public static void main(String [] args){
		Pune obj= new Pune();

		obj.lockdown();
		obj.noLockdown();
		obj.lockdown();
		obj.noLockdown();
		Pune.noCorona();
		
		Mumbai obj2= new Mumbai();

		obj2.lockdown();
		obj2.noLockdown();
		obj2.lockdown();
		obj2.noLockdown();
		Mumbai.noCorona();
	}
}