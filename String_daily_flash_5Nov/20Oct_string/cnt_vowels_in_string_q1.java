/*1) write a program and count the number of vowels in string*/
import java.util.*;
import java.io.*;
class Vowels{

	public static void main(String [] args) throws IOException{

		//To get By default string use Scanner & to get Sentence use BufferedReader.
		//Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter a String:");
		String s1=new String(br.readLine());

		StringTokenizer st=new StringTokenizer(s1," ");
		s1=st.nextToken();

		int acnt=0,ecnt=0,icnt=0,ocnt=0,ucnt=0;
		for(int i=0; i<s1.length(); i++){
			
			if(s1.charAt(i)=='a')
				acnt++;
			
			else if(s1.charAt(i)=='e')
				ecnt++;
			
			else if(s1.charAt(i)=='i')
				icnt++;
			
			else if(s1.charAt(i)=='o')
				ocnt++;
			
			else if(s1.charAt(i)=='u')
				ucnt++;
		}
			System.out.println("No. of a= "+acnt);
			System.out.println("No. of e= "+ecnt);
			System.out.println("No. of i= "+icnt);
			System.out.println("No. of o= "+ocnt);
			System.out.println("No. of u= "+ucnt);
			System.out.println("Total number of Vowels = "+(acnt+ecnt+icnt+ocnt+ucnt));
		
	}
}
