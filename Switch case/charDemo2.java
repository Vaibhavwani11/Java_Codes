
class switchDemo7{
	
	public static void main(String [] args){
	
		char x= 'A'; //byte short int char is applicable only

	System.out.println("Before Switch");
		
		switch(x){

			case 'A':
				System.out.println("A");	
				break;

			case 65: //error: duplicate case label
				System.out.println("65");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
}
