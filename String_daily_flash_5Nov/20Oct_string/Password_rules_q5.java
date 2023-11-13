/*5)Write a Java program to check whether a string is a valid password or not. 
 Password rules: password must have at least 8 characters.
 A password consists of at least one digits and one special symbol(@,%,$#).*/
class Password{

	public static void main(String [] args){
	
		String s1=new String("Vaibhav@123");

		int acnt=0,ncnt=0;
		if(s1.length()>=8){
		
			for(int i=0; i<s1.length(); i++){
				
				if(s1.charAt(i)>=58 && s1.charAt(i)<=64)
					acnt++;
				
				if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
					ncnt++;
			}
		}
		else{
			System.out.println("must have 8 characters");
		}	
		if(acnt>=1 && ncnt>=1)
			System.out.println("Password= "+s1);
		else
			System.out.println("must have at least 1 spl char & integer");

	}
}
