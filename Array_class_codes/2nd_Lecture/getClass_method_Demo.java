class IPL{

	void match(){
	
		System.out.pritln("This is getClass Demo");
	}
	public static void main(String [] args){
	
		IPL obj=new IPL();
		obj.match();
		
		//getClass is the method of Object class in java.lang Package
		//methods of Object class can be known by:
		//javap java.lang.Object
		System.out.println(obj.getClass());
	}
}
