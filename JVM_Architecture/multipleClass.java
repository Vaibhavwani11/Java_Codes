class India{
	static double totalPopulation=125000000;
	double GDP=89125100;

	static void population(){
		System.out.println("Population of India:"+totalPopulation);	
	}
	
	void displayGDP(){
		System.out.println("GDP:"+GDP);
	}
}
class China{
	static double totalPopulation=20185100;
	long GDP=985151000;
	
	static void population(){
		System.out.println("Population of China:"+totalPopulation);
	}
	void displayGDP(){
		System.out.println("GDP:"+GDP);
	}
}
class IndoChina{
	public static void main(String[] args){
		India  Maharashtra=new India();
		Maharashtra.GDP=1123040;
		Maharashtra.displayGDP();	
		Maharashtra.population();
	
		India  Gujrat= new India();
		Gujrat.population();
		Gujrat.GDP=10051484;
		Gujrat.displayGDP();
	
		China bijing= new China();
		bijing.population();
		bijing.GDP=301205184;
		bijing.displayGDP();	
	
		China shanghay= new China();
		shanghay.population();
		shanghay.GDP=2030510;
		shanghay.displayGDP();	

		
	
	}
}