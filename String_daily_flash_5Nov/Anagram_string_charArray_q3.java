/*3) Write a code of Java, to accept two strings from user and 
 find whether they are anargam using character array.
 An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
 For example, “shashi” and “ashish”, "listen" & "silent" are an anagram of each other.
 */
import java.io.*;
import java.util.Arrays;
class AnagramS{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		isr.close();
		br.close();
		String s1="shashi";
		char []carr =s1.toCharArray();

		char []carr1=new char[5];

		

		//Taking 1st string from user
		System.out.println("Enter String 1: ");
		for(int i=0; i<carr.length; i++){

			carr[i]= (char)br.read();
		}
		//Taking 2nd string from user
		System.out.println("Enter String 2: ");
		for(int i=0; i<carr1.length; i++){

			carr1[i]= (char)br.read();			
		}
		System.out.println("ans= "+checkAnagram(carr,carr1));

		if(carr.length==carr1.length){
			
			int cnt=0;
			for(int i=0; i<carr.length; i++){
				
				for(int j=0; j<carr1.length; j++){

					if(carr[i]==carr1[j]){
						cnt+=1;
						break;
					}				
				}
			}
			System.out.println(cnt);
			if(cnt==carr.length)
				System.out.println("Anagram String");
		}
	}
	//way2: 
	static boolean checkAnagram(char str1[], char[] str2){

		System.out.println("IN fun");
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		Arrays.sort(str1);
		Arrays.sort(str2);
		//System.out.println(str1);
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		return Arrays.equals(str1, str2); 
	}
}
