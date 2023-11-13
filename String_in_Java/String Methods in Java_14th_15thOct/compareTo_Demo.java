//Return Type= int
class compareTo_Demo{

	public static void main(String [] args){
	
		String s1= "Vaibhav";
		String s2= new String("Vaibhav");
		String s3= "Biencaps";

	
	//Scenario 1:-
		System.out.println(s1.compareTo(s2)); //0 (same String)
		System.out.println(s1.compareTo(s3)); // V-B =20 
		
	//Scenario 2:-
		String s5= new String("VaibhavWani"); 
		System.out.println(s1.compareTo(s5));//Both Strings are same upto 'v' 
		//Difference between Strings = -4 
	 	//s5 has 4 more characters than s1
						      
	//Scenario 3:-
		String s4= new String("Bielearn");
		System.out.println(s3.compareTo(s4));//Both Strings are same upto 'e'
	       	// n-l= 2  will be returned
			
		
	}
}
