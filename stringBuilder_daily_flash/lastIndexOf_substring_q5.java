/* 5. Write a program to take a string and substring from the user and
 find the last occurrence index of the substring and print the result.
 Print apropriate message if Substring is not print.
Input :- Enter the String: Core2web Core2web 
	 Enter SubString : we 
Output:- Last Occurrence Index = 14 */
import java.util.*;
class lastIndex{

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);	

		System.out.println("Enter String");
		String s1=new String(sc.next());

		System.out.println("Enter substring");
		String s2=new String(sc.next());

		System.out.println(s1.lastIndexOf(s2));
	}	
}
