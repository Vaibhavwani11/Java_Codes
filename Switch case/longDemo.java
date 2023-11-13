
class switchDemo5{
	
	public static void main(String [] args){
	
		float x=84.2f; //byte short int char is applicable only

	System.out.println("Before Switch");
		
		switch(x){

			case 127.2f:
				System.out.println("True");	
				break;

			case 10.2f:
				System.out.println("False");
		
				break;
			
			default:
				System.out.println("Default case");
				break;
		}
	System.out.println("After Switch");
	}
}
//long double and float is not applicable
