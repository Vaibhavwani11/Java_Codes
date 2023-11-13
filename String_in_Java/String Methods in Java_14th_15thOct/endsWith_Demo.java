//Return Type= Boolean
//Case sensitive
//char is not allowed
class endsWith_Demo{

	public static void main(String [] args){
		
		String s1=new String("Bielearn");
		String s2=new String("Biencaps");
		String s3=new String("MegaTechz");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.endsWith("learn"));//true
		System.out.println(s2.endsWith("s"));//true
		System.out.println(s3.endsWith("Techz"));//true
	}
}
