
class switchDemo8{
	
	public static void main(String [] args){
	
		String x= "Vaibhav";
		String y= new String("Shashi");

	System.out.println("way to write String="+y);
	System.out.println("Before Switch");
		
		switch(x){

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
