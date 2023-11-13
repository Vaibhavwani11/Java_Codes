
class switchDemo4{
	
	public static void main(String [] args){
	
		short x= 32767;//short ranges from -32766 to 32767

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
