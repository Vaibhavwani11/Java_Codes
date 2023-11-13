
class switchDemo6{
	
	public static void main(String [] args){
	
		char x= 'A'; //byte short int char is applicable only

	System.out.println("Before Switch");
		
		switch(x){

			case 'A':
				System.out.println("True");	
				break;

			case '8':
				System.out.println("False");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
	
}//char is converted to int
