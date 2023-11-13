

class switchDemo3{
	
	public static void main(String [] args){
	
		byte x= 127;//byte ranges from -126 to 127

	System.out.println("Before Switch");
		
		switch(x){ //switch and case must range between range if data Type


			case 127:
				System.out.println("True");	
				break;

			case 100:
				System.out.println("False");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
}
