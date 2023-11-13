//addition of even and odd digits in a number
class evenOdd{

	public static void main(String [] args){
		
		int num=12345;
		int add=0,mult=1;
		int rem=0;

		while(num!=0){
		
			rem=num%10;
			
			if(rem%2==0)
				add= add+ rem;

			else
				mult= mult *rem;

		num=num/10;
		
		}
	System.out.println("addition of even digits="+add);	
	System.out.println("multiplication of odd digits="+mult);	
	}
}
