class Cricket{ 
	
 	static String capt ="Virat Kohli";  //static variable
	int a= 10;      		    //Instance variable
	
	int BCCI(){
	
		System.out.println("Player List");
		System.out.println(a);   //direct access to instance
		System.out.println(capt);//direct access to static
	
	    	return 0;
	}
	
	static void IPL(){

		System.out.println("emerging players");
		
		cricket object=new cricket();
		System.out.println(object.a); //access on object to instance
		
		System.out.println(capt);  //direct access to static 
	}
//Entry Point Function
	public static void main(String[] args){
		
		IPL();    //direct call to static
		
		cricket obj=new cricket();
		obj.BCCI();  //call on object to instance
	}
}	
