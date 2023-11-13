/*4) Write a Java program to check whether a string is a palindrome or not*/
class Palindrome{

	public static void main(String [] args){
	
		String s1=new String("ababa");
		System.out.println(isPallindrome(s1));
		//System.out.println(substrCount(5, s1));
	}
	static long substrCount(int n, String s) {
            
            int cnt=0;
            for(int j=0; j<s.length(); j++){

				String s1="";
				
                for(int i=j; i<s.length(); i++){
                    
                    s1=s1+s.charAt(i);
					//System.out.println(s1);
                    if(isPallindrome(s1)){
                        cnt++;
                }
            }
		}
		return cnt;
	}
	static boolean isPallindrome(String s){
        
		int cnt=0;
		for(int i=0; i<s.length(); i++){
				
				if (s.charAt(i)==s.charAt(s.length()-i-1)){
					cnt++;
				}
			}
			if(cnt==s.length()){
				System.out.println(s);
				return true;
			}
			else{
				return false;
			}
		}
}

