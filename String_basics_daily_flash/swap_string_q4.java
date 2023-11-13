/*4) Use a string variable s1 to store string literal, and use another string variable s2 to store string object
 Later use s1 to store string object and use s2 to store string literal. Check whether such swapping works.*/
class Swap_memory{
	
	public static void main(String [] args){
			
		String s1= "Vaibhav";
		String s2=new String("Wani");
	
		System.out.println(s1);
		System.out.println(s2);
	
		String temp=new String();

		temp=s1;
		s1=s2;
		s2=temp;

		System.out.println(s1);
		System.out.println(s2);
	}
}

