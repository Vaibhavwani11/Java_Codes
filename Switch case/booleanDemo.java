
class switchDemo8{
	
	public static void main(String [] args){
	
		boolean x= true;

	System.out.println("Before Switch");
		
		switch(x){ // boolean can not be written in switch or case

			case true:
				System.out.println("true");	
				break;

			case false:
				System.out.println("false");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
}	
