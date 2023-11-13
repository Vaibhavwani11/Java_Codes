class Switch{

	public static void main(String [] args){
	
		int num1=10, num2=20;
		char Opr='+';

		switch(Opr){
		
			case '+':
				System.out.println("Addition="+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction="+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication="+(num1*num2));
				break;
			case '/':
				System.out.println("Division="+(num1/num2));
				break;
			case '%':
				System.out.println("MOdulus="+(num1%num2));
				break;
		}
	}
}
