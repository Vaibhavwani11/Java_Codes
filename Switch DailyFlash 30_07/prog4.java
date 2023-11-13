class Switch{

	public static void main(String [] args){
	
		char lang='J';

		switch(lang){
		
			case 'P':
			case 'p':	
				System.out.println("Python");
				break;

			case 'K':
			case 'k':	
				System.out.println("Kotlin");
				break;
			
			case 'J':
			case 'j':
				System.out.println("Java");
				break;

			case 'C':
			case 'c':	
				System.out.println("C language");
				break;

			case 'R':
			case 'r':	
				System.out.println("Ruby");
				break;
		}

	}
}
