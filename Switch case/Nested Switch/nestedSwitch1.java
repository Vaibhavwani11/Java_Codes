class nestedSwitch{

	public static void main(String[] args){
		
		int floor=1;

		switch(floor){
			
			case 1:{
				System.out.println("Welcome to First Floor!");
				int choice='s'; //'s' for shopping & 'g' for gaming

				switch(choice){
				
					case 's':
					case 'S':
						System.out.println("Great deals at Big Bazar..");	
						break;

					case 'g':
					case 'G':
						System.out.println("Gaming Zone");
						break;
				}
			       break;
			       } 
			case 2:{
			       	System.out.println("Welcome to second Floor!");
				int choice='f';  //'f' for food & 'm' for movies

				switch(choice){
					
					case 'f':
					case 'F':
						System.out.println("Food Court...");
						break;
					
					case 'm':
						System.out.println("Movie Screen..");
						break;
				}
			       	break;
			       }
		}	       
		
	}
}
