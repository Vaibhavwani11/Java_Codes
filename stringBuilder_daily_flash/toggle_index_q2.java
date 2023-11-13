/*2. Writ a program to take a string and an index from the user.And
  toggle (if uppercase make it lowercase or vice versa) character of the given index from the string and 
  print the result. Print "Invalid Index" if index not present. 
Input :- Enter the String : Core2web
 	 Enter the index: 5
Output:- String = Core2Web */
import java.util.*;
class tOOGLE{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String: ");
		String s1=new String(sc.next());
		
		System.out.println("Enter Index: ");
		int index=sc.nextInt();

		String s2=new String(s1);
		System.out.println(s2);
			
		if(index<0 || index>s1.length())
			System.out.println("Invalid Index");
		else	
			//s1.replace("a","S");
		//	s2.charAt(index) = s1.charAt(index)+32;
			System.out.println(s2.charAt(index));		
			System.out.println(s2);		
	}
}
