/*3) Write a program to find if a String s1 contains another string s2 as a substring or not.*/
class subString{

	public static void main(String [] args){
					
		String s1=new String("Vaibhav");
		String s2=new String("bhav");	

		System.out.println(s1.length());
		for(int i=0; i<s1.length(); i++){
		
			for(int j=i; j<=s1.length(); j++ ){
					
				System.out.println(s1.substring(i,j));
				
				if(s1.substring(i,j).equals(s2)){
					System.out.println("s2 is substring of s1");
					break;
				}
			}
		}

	}	
}
