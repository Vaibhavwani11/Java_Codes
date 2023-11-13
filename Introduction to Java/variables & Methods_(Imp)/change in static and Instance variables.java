class Kutumb{
	
	int mob=1;
	int laptop=1;
	
	static int tv=1;
	
	void dadaMethod(){

		System.out.println("Mobile=" +mob);
		System.out.println("Laptop= " +laptop);
		System.out.println("Tv=" +tv);
	}
	void vaibhavMethod(){

		System.out.println("vaibhav Mobile=" +mob);
		System.out.println("vaibhav Laptop =" +laptop);
		System.out.println("vaibhav Tv= " +tv);
	}
	
	static public void main(String[] vbw){
		
		Kutumb dada= new Kutumb(); //classname objName=new className
	
		dada.mob=0;  //instance variable is changed by Dada{Mobile mdhe fb open kela..}
		dada.tv=0;
		dada.dadaMethod(); //static variable is changed by dada{Tv fodla..}
	
		Kutumb vaibhav=new Kutumb();
		vaibhav.vaibhavMethod();  //{Tv mazyasathi pn futla..pn Mazya mob mdhe pn fb open nahi zala..}
	}
}	
//change in static variable is reflected to all Objects
//change in instance variable is for that Object only	

