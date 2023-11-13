/*2) Take two strings from user and store one string in string literal and another in string object.
  Print both the strings separated by double quotes*/
import java.util.*;
class StringDemo{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		String s1=sc.next();	
		String s2=new String(sc.next());

		System.out.println(s1+" "+s2);	
	}
}
