
class switchDemo{
	
	public static void main(String [] args){
	
		int var=10;

		System.out.println("After Switch");
		
		switch(var){
		//byte short int long and char are valid for switch in java
			
			
			default:
				System.out.println("Default Case");
				break;

			case 1:
				System.out.println("One");	
				break;

			case 2:
				System.out.println("Two");
		
				break;
			case 3:
				System.out.println("Three");
				break;
			
			case 4:
				System.out.println("Four");
				break;
			
			
		}
	System.out.println("After Switch");
	}
}
