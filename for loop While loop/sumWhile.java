class Sum{

	public static void main(String [] args){
	
		int num=123;
		int rem=0, sum=00;

		while(num!=0){
		
			rem= num % 10;

			sum= sum + rem;

			num= num/10;
		}
		System.out.println("Sum of digits of a number="+sum);
	}
}
