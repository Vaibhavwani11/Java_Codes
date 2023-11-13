	
class switchDemo9{
	
	public static void main(String [] args){
	
		StringBuffer x= new StringBuffer("Shashi");

	
	System.out.println("Before Switch");
		
		switch(x){ //byte short int char string are applicable only

			case "Vaibhav":
				System.out.println("Capital");	
				break;

			case "veb":
				System.out.println("Small");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
}	
