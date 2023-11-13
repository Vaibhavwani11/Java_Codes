/*
 *Write a program that print Average of all the digits of a number
 */
class Average{

	public static void main(String [] args){
	
		int num=12345;
		int cnt=0, sum=0, rem=0;
		int Average=0;

		while(num!=0){
		
			rem=num % 10;
			cnt++;

			sum= sum + rem;
			num= num/10;

		}
		System.out.println("Addition of digits="+sum);
		System.out.println("Number of digits="+cnt);
		
		Average= sum/cnt;
		System.out.println("Average of all Digits="+Average);
	}
}
