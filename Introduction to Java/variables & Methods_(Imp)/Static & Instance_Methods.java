class Family{
	
	int mob=1;     //instance varibles
	int laptop=1;
	
	static int tv=1;  //static (Common) variables

	void vaibhavMethod(){
	
		System.out.println("In Display" );
	}
	static void shashiMethod(){
	
		System.out.println("In statDisplay");
	}
	public static void main(String[] args){

	//object is compulsory required to call instance method
		Family obj= new Family();
		obj.vaibhavMethod();
		
		shashiMethod();	
	//static method can be called directly from static method.
	}	
}
