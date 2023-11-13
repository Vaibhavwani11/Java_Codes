//equals() Method compares the Values of String
//Return Value: Boolean
//equals() is inherited from Object class
//At first compares the length of Strings, if find equal then compares character by character
//Case Sensitive
class equalsDemo{

	public static void main(String [] args){
	
		String s1= "Shashi"; //SCP(100)
		String s2= new String("Shashi"); //Heap (500)
		String s3= "shashi"; //SCP (200)
		
		System.out.println(s1==s2); //False
		System.out.println(s2==s3); //False  
		
		System.out.println(s1.equals(s2)); //True
		System.out.println(s1.equals(s3)); //False
	}
}
