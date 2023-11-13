/*2) Write a Program that accepts a String from user and toggle each character in a string.*/
import java.io.*;
import java.util.*;
class tOOGLE{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String s1=new String(br.readLine());

		StringTokenizer st=new StringTokenizer(s1," ");
		s1=st.nextToken();
		
		String s2=new String("Vaibhav");
		
		for(int i=0; i<s1.length(); i++){
		
			System.out.println(s2.charAt(i));
			//s1.charAt(i)=s2.charAt(i);
				//=(char)((int)s1.charAt(i)+32);
		}
		System.out.println((char)((int)s1.charAt(1)+32));

	}
}
