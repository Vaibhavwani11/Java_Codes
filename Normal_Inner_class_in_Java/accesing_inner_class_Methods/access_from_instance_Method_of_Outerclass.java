class outer{
	int x=10;
	class inner{
	
		void m1(){
			System.out.println("In Inner class");
		}
	}
	void main(){
		new inner().m1();
	     //OR
	        inner i= new inner();
		i.m1();
	}
	public static void main(String [] args){
	
		new outer().main();
	}
}
	
