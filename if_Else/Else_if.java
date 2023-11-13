
class else_if{
	
	public static void main(String [] args){
		int num=25;

		if(num>=0 && num<=10)
			System.out.println("Number is between 0 and 10 ");

		else if(num>10 && num<=15){
			System.out.println("Number is between 10 and 15");
		}

		else if(num>15 && num<=20){
			System.out.println("Number is between 15 and 20");
		}
		
		else if(num>20 && num<=25){
			System.out.println("Number is beween 15 and 25");
		}

		else if(num>25){
			System.out.println("Number is Greater than 25");
		}

		else{
			System.out.println("Negative Number!");
		}

	}


}
