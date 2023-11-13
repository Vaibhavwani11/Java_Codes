/*3. Write a program to take two strings from the user and append each character from the
 two strings alternatively and print the result.
 {Note: Use of String Builder is a must.}
 Input :-Enter 1st String: Core2web
 	 Enter 2nd String:Technologies
 Output:-
 	Result =CToerceh2nwoelbogies*/
import java.util.*;
class appendChar{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st String: ");
		StringBuilder sb1=new StringBuilder(sc.next());
		
		System.out.println("Enter 2nd String: ");
		StringBuilder sb2=new StringBuilder(sc.next());
		
		System.out.println(sb1);
		System.out.println(sb2);
		for(int i=0; i<sb2.length(); i++){
			
			System.out.println(sb1.append(sb2.charAt(i)));
			
		}
	}
}
