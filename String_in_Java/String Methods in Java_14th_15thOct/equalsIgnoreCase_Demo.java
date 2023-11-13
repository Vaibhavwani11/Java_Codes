//compares values but ignores the case o Strings
class equalsIgnoreCase_Demo{

	public static void main(String [] args){
	
		String s1= "VAIBHAV"; //SCP(100)
		String s2= new String("vaibhav"); //Heap (500)
		String s3= "VaIbHaV"; //SCP (200)
		
		System.out.println(s1==s2); //False
		System.out.println(s2==s3); //False  
		
		System.out.println(s1.equalsIgnoreCase(s2)); //True
		System.out.println(s1.equalsIgnoreCase(s3)); //True
	}
}
