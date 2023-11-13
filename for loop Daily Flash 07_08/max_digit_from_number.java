/*
 Write a program that prints maximum digit from that number. 
 * */
class Count{


	public static void main(String [] args){
	
		int num=1218452345;
		int greater=0;
		int rem=0;

		while(num!=0){

			rem=num%10;
			num=num/10;
			
			if(rem>greater){
				
				greater=rem;
			}
		
		}
		System.out.println("Maximum Number="+greater);
	}
}
