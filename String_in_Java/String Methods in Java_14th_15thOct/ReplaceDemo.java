//Return Type= String
//Can replace String with String or Character with Character
class replaceDemo{

	public static void main(String [] args){
	
		String s1= new String("Vaibhav");
		System.out.println(s1); // Vaibhav

		s1= s1.replace('a','s'); //'a' will be replaced with s
		
		System.out.println(s1); // Vsibhsv
		
		s1= s1.replace("sv", "zz"); //"av" will be replaced with "zz"
		System.out.println(s1); // Vsibhzz
	}
}
